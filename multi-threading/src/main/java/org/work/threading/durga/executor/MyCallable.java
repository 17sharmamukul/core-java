package org.work.threading.durga.executor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("Before Sleep: "+ Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Before Sleep: "+ Thread.currentThread().getName());
        return 5;
    }
}
