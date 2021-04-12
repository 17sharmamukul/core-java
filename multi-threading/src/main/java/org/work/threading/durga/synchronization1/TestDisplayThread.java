package org.work.threading.durga.synchronization1;

public class TestDisplayThread {
    public static void main(String[] args) {

        Display d = new Display();

        DisplayThread thread1 = new DisplayThread(d, "Mukul Sharma");
        Thread t1 = new Thread(thread1);

        DisplayThread thread2 = new DisplayThread(d, "Rahul Sharma");
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

    }
}
