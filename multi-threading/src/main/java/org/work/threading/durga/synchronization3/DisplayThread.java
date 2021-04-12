package org.work.threading.durga.synchronization3;


public class DisplayThread implements Runnable {

    private Display display;
    private String name;

    public DisplayThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.wish(name);
    }
}

/***
 * If we are not declaring synchronized block inside wish method then both threads will be executed simultaneously
 * and hence we'll get irregular output
 *
 * OR
 * If we declare wish method as sync then at a time only one thread is allowed to execute wish() method on the
 * given display object hence we'll get regular output.
 *
 ***/