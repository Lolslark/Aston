package Aston.step4;

public class MyThread implements Runnable{
    private final int thread;

    MyThread(int thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()  + ": " + thread);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread(1));
        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        Thread thread2 = new Thread(new MyThread(2));
        thread2.start();
    }
}
