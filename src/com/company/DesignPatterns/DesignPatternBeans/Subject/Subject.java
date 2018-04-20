package com.company.DesignPatterns.DesignPatternBeans.Subject;

import com.company.DesignPatterns.DesignPatternBeans.Observer.Observer;

/**
 * Created by lipeiyuan on 2018/3/28.
 */
public interface Subject {
    boolean registerObserver(Observer observer);
    boolean removeObserver(Observer observer);
    void notifyObserver();

    void setMessage(String aaa);
}
