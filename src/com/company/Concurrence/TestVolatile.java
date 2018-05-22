package com.company.Concurrence;

/**
 * Created by lipeiyuan on 2018/5/13.
 */
public class TestVolatile {
    int a = 1;
    int b = 2;

    public void change() {
        System.out.println("执行change");
        a = 3;
        b = a;
    }

    public void print() {
        System.out.println("b="+b+" ; a="+a);
    }

    public static void main(String[] args) {
        while (true) {
            final TestVolatile testVolatile = new TestVolatile();
            new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                testVolatile.change();
            }).start();

            new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                testVolatile.print();
            }).start();
        }
    }
}













