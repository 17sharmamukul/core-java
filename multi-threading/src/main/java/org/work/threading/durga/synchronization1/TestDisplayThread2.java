package org.work.threading.durga.synchronization1;

public class TestDisplayThread2 {
    public static void main(String[] args) {

        Display d1 = new Display();

        Display d2 = new Display();

        DisplayThread thread1 = new DisplayThread(d1, "Mukul Sharma");
        Thread t1 = new Thread(thread1);

        DisplayThread thread2 = new DisplayThread(d2, "Rahul Sharma");
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

    }
}
