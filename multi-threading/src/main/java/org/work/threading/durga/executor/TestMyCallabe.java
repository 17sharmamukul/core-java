package org.work.threading.durga.executor;

import java.util.concurrent.ExecutionException;

public class TestMyCallabe {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*MyCallable[] jobs = {
                new MyCallable(),
                new MyCallable(),
                new MyCallable(),
                new MyCallable(),
                new MyCallable(),
                new MyCallable(),
                new MyCallable()
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(MyCallable job : jobs) {
            Future f = service.submit(job);
            System.out.println(f.get());
        }*/

        MyCallable job = new MyCallable();
        Thread t = new Thread((Runnable) job);
    }
}
