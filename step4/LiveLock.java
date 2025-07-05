package Aston.step4;

import java.util.concurrent.locks.ReentrantLock;

public class LiveLock {
    static class Car {
        private final String name;
        private final ReentrantLock lock = new ReentrantLock();

        public Car(String name) {
            this.name = name;
        }

        public boolean tryDrive(Car other) {
            if (lock.tryLock()) {
                try {
                    if (other.lock.tryLock()) {
                        try {
                            System.out.println(name + " проезжает!");
                            return true;
                        } finally {
                            other.lock.unlock();
                        }
                    } else {
                        System.out.println(name + " уступает " + other.name);
                        return false;
                    }
                } finally {
                    lock.unlock();
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        final Car car1 = new Car("Toyota");
        final Car car2 = new Car("Audi");

        Thread t1 = new Thread(() -> {
            while (!car1.tryDrive(car2)) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {}
            }
        });

        Thread t2 = new Thread(() -> {
            while (!car2.tryDrive(car1)) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {}
            }
        });

        t1.start();
        t2.start();
    }
}
