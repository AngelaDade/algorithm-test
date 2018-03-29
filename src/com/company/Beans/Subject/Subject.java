package com.company.Beans.Subject;

import com.company.Beans.Observer.Observer;

/**
 * Created by lipeiyuan on 2018/3/28.
 */
public interface Subject {
    boolean registerObserver(Observer observer);
    boolean removeObserver(Observer observer);
    void notifyObserver();

    void setMessage(String aaa);
}
