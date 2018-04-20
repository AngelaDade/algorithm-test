package com.company.DesignPatterns.DesignPatternBeans.Singletons;

/**
 * Created by lipeiyuan on 2018/4/11.
 * 饿汉式单例模式：在类加载时就完成了初始化，所以类加载比较慢，但获取对象的速度快,这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，这时候初始化instance显然没有达到lazy loading的效果。
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }

}
