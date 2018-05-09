package com.company.Threads;

/**
 * Created by lipeiyuan on 2018/5/3.
 */
public class TestThread {

    private static String stringA = "a";
    private static String stringB = "b";

    public static void main(String[] agrs){
        TestThread testThread = new TestThread();
        testThread.deadLock();
    }
    private void deadLock() {

        //t1要sleep因为要让程序执行到t2获得b锁
        Thread t1 = new Thread( () -> {
            synchronized(stringA) {
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (stringB) {
                    System.out.println(11111);
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (stringB) {
                synchronized (stringA) {
                    System.out.println(222222);
                }
            }

        });


        t1.start();
        t2.start();
    }

}
