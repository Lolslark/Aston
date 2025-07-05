package Aston.step4;

public class DeadLock implements Runnable{
    static class DayTime {
    }
    private final DayTime night = new DayTime();
    private final DayTime morning = new DayTime();

    public void doNight (){
        synchronized (night){
            System.out.println(Thread.currentThread().getName() + " начинает светить.");
            synchronized (morning){
                System.out.println(Thread.currentThread().getName() + " прекращает светить.");
            }
        }
    }

    public void doMorning (){
        synchronized (morning){
            System.out.println(Thread.currentThread().getName() + " начинает светить.");
            synchronized (night){
                System.out.println(Thread.currentThread().getName() + " прекращает светить.");
            }
        }
    }

    @Override
    public void run() {
        doMorning();
        doNight();
    }

    public static void main(String[] args) throws InterruptedException {
        DeadLock dayTime = new DeadLock();
        Thread sun = new Thread(dayTime, "Солнце");
        Thread moon = new Thread(dayTime, "Луна");
        sun.start();
        moon.start();
    }
}
