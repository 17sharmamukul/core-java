package org.work.threading.durga;

public class YieldMethod {
    public static void main(String[] args) {

        System.out.println("Main Thread");

        Thread t1 = new Thread(() -> {
              for(int i = 0; i < 500; i++) {
                  System.out.println(Thread.currentThread().getName());
                  Thread.yield();
              }

        }, "Thread-M1");
        t1.start();

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName());
            }

        }, "Thread-M2");
        t2.start();

        /*for(int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }*/
    }
}