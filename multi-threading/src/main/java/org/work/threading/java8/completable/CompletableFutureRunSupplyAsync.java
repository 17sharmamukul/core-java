package org.work.threading.java8.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureRunSupplyAsync {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(2000);} catch (Exception e) {}

            System.out.println(Thread.currentThread().getName() + "--" + Thread.currentThread().isDaemon());
            return "Hello";
        });
        // String str1 = future1.get();

        /*CompletableFuture future2 =  CompletableFuture.runAsync(() -> {
            // try { Thread.sleep(2000);} catch (Exception e) {}
            while (true)
                System.out.println("In Run Async");
        });*/
    }

    /*public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "--" + Thread.currentThread().isDaemon());
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "--" + Thread.currentThread().isDaemon());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mukul");
        });
    }*/

    /*public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello in new thread");
        });
        t.start();
        System.out.println("Main Thread");
    }*/
}
