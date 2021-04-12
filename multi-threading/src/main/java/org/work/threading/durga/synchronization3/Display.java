package org.work.threading.durga.synchronization3;

public class Display {

    public void wish(String name) {
        ;;;;;;;;;;;; /*** 1 Lack Line Of Code ***/
        synchronized (this) {
            for(int i = 0; i < 10; i++) {
                System.out.print("Good Morning: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
                System.out.println(name);
            }
        }
        ;;;;;;;;;;;; /*** 1 Lack Line Of Code ***/
    }

}
