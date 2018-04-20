package com.company.DesignPatterns.DesignPatternBeans.Subject;

import com.company.DesignPatterns.DesignPatternBeans.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lipeiyuan on 2018/3/29.
 */
//wechatServer是被观察者的实现类
public class WechatServer implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public boolean registerObserver(Observer observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        if (!observers.isEmpty()) {
            return observers.remove(observer);
        } else {
            return false;
        }
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(observer -> observer.update(message));
    }

    public void setMessage (String message) {
        this.message = message;
        System.out.println("被观察者消息更新为-----" + message);
        this.notifyObserver();
    }
}
