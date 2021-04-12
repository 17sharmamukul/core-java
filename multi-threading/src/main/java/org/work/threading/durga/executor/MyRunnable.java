package org.work.threading.durga.executor;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Before Sleep: "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After Sleep: "+ Thread.currentThread().getName());
    }
}
