package com.company.mains;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/3/13.
 */
public class testThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread myThread = new Thread() {
            public void run() {
                System.out.println("myThread is running");
            }
        };
        myThread.start();
        //匿名类创建
        for (int i = 0 ; i < 10 ; i++) {
            new Thread(" " + i) {
                public void run () {
                    System.out.println("Thread----"+getName()+"------is running");
                }
            }.start();
        }

        //函数式编程


        Scanner scanner = new Scanner(System.in);
        System.out.println("scaner------输出"+scanner.nextLine());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("buffer------输出"+bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
