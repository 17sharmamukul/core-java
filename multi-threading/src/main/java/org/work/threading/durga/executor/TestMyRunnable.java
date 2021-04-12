package org.work.threading.durga.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMyRunnable {

    public static void main(String[] args) {
        MyRunnable[] jobs = {
                new MyRunnable(),
                new MyRunnable(),
                new MyRunnable(),
                new MyRunnable(),
                new MyRunnable(),
                new MyRunnable(),
                new MyRunnable()
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(MyRunnable job : jobs) {
            service.submit(job);
        }
        System.out.println("mukul sharma");
        service.shutdown();
    }
}
