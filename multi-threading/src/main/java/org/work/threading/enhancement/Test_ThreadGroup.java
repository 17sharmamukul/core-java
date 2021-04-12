package org.work.threading.enhancement;

public class Test_ThreadGroup {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        ThreadGroup g1 = new ThreadGroup("FirstGroup");
        System.out.println(g1.getParent().getName());
        ThreadGroup g2 = new ThreadGroup(g1, "SecondGroup");
        System.out.println(g2.getParent().getName());
    }
}
