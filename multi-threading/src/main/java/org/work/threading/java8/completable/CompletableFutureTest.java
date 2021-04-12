package org.work.threading.java8.completable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CompletableFutureTest {
    public static void main(String[] args) {
        CompletableFuture<String> future = calculateAsync();
//        CompletableFuture<String> obj2 = calculateAsync2();
        System.out.println("objdemo:" + future.isDone());
        try {
            System.out.println("After calling object");
            String result = future.get();
            System.out.println("Result---" + result);
//            String result2 = obj2.get();
//            System.out.println("result2--" + result2);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Mukul Sharma");
    }

    private static CompletableFuture<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        List<String> list = new ArrayList<>();
        list.add("Mukul1");
        list.add("Mukul2");
        list.add("Mukul3");
        list.add("Mukul4");
        list.add("Mukul5");

        Executors.newCachedThreadPool().submit(() -> {
           try {
               Thread.sleep(3000);
               String joinedStr = String.join(",",  list);
               completableFuture.complete(joinedStr);

           } catch (Exception e) {}
           return null;
        });
        System.out.println("name in :" + Thread.currentThread().getName());
        return completableFuture;
    }

    private static CompletableFuture<String> calculateAsync2() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        List<String> list = new ArrayList<>();
        list.add("Mukul12");
        list.add("Mukul22");
        list.add("Mukul33");
        list.add("Mukul44");
        list.add("Mukul55");

        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(5000);
                String joinedStr = String.join(",",  list);
                completableFuture.complete(joinedStr);

            } catch (Exception e) {}
            return null;
        });
        System.out.println("name in 2:" + Thread.currentThread().getName());
        return completableFuture;
    }
}
