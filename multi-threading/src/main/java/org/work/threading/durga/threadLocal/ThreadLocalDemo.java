package org.work.threading.durga.threadLocal;

public class ThreadLocalDemo {

    public static void main(String[] args) {

        ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();

        Runnable task1 = () -> {
            ThreadLocalHolder.getThreadLocal1().set(11);
            ThreadLocalHolder.getThreadLocal2().set(13);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 1: " + ThreadLocalHolder.getThreadLocal1().get());
            System.out.println("Task 1: " + ThreadLocalHolder.getThreadLocal2().get());
        };

        Runnable task2 = () -> {
            ThreadLocalHolder.getThreadLocal1().set(21);
            ThreadLocalHolder.getThreadLocal2().set(23);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2: " + ThreadLocalHolder.getThreadLocal1().get());
            System.out.println("Task 2: " + ThreadLocalHolder.getThreadLocal2().get());
        };

        new Thread(task1).start();
        new Thread(task2).start();

    }

}

class ThreadLocalHolder {

    private static final ThreadLocal<Integer> threadLocal1 = new ThreadLocal<>();

    private static final ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();

    public static ThreadLocal<Integer> getThreadLocal1() {
        return threadLocal1;
    }

    public static ThreadLocal<Integer> getThreadLocal2() {
        return threadLocal2;
    }
}