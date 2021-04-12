package org.work.threading.durga;

public class InterruptDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Child Threading going to sleep");
                Thread.sleep(1);
                System.out.println("Child Threading going to wake");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Child Threading going to wake");
            }
        });
        t1.start();
        try{
            Thread.sleep(5000);
        } catch (Exception e) {}

        System.out.println("after leeping for 5 seconds");
        t1.interrupt();
    }
}
