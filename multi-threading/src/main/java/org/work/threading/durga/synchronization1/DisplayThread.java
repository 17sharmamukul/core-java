package org.work.threading.durga.synchronization1;

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
 * If we are not declaring wish method as synchronized then both threads will be executed simultenaously
 * and hence we'll get irregular output
 *
 * OR
 * If we declare wish method as sync then at a time only one thread is allowed to execute wish() method on the
 * given display object hence we'll get regular output.
 *
 ***/