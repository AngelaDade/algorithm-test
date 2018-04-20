package com.company.DesignPatterns.DesignPatternBeans.Singletons;

/**
 * Created by lipeiyuan on 2018/4/11.
 * 懒汉单例设计模式，lazy loading(类加载是不做初始化，知道调用时才进行初始化),线程不安全，可能多个线程同时进入if (lazySingleton == null) 的条件中
 */

public class LazySingleton {
    private static LazySingleton lazySingleton;
    //构造函数私有化
    private LazySingleton(){}

    public static LazySingleton getLazySingleton(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
