package com.company.Threads;

/**
 * Created by lipeiyuan on 2018/4/16.
 * 利用Future和Callable创建进程
 */

import java.util.concurrent.*;

class ThirdThread {

}

public class Demo3 {

    public static void main(String[] args) {
        //创建Callable对象
        ThirdThread rt=new ThirdThread();
        //先使用Lambda表达式创建Callable<Integer>对象，
        //并使用FutureTask来包装Callable对象
        FutureTask<Integer> task=new FutureTask<Integer>((Callable<Integer>)()->{
            int i=0;
            for(;i<1000;i++){
                System.out.println(Thread.currentThread().getName()+"===="+i);
            }
            //call()方法可以有返回值
            return i;
        });



        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
            if(i==20){
                Thread t1=new Thread(task,"有返回值的线程");
                t1.start();
            }
        }
        try {
            System.out.println("子线程的返回值："+task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Test线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
    }
}