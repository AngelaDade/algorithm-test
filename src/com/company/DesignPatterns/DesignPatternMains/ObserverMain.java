package com.company.DesignPatterns.DesignPatternMains;

import com.company.DesignPatterns.DesignPatternBeans.Observer.Observer;
import com.company.DesignPatterns.DesignPatternBeans.Observer.User;
import com.company.DesignPatterns.DesignPatternBeans.Subject.Subject;
import com.company.DesignPatterns.DesignPatternBeans.Subject.WechatServer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lipeiyuan on 2018/3/29.
 */
public class ObserverMain {
    public static void main(String[] args) {
        List<Observer> userList = new ArrayList<>();
        Subject wechatServer = new WechatServer();
        for (int i = 0 ; i < 4 ; i++) {
            userList.add(new User("user"+i));
        }
        userList.stream().forEach(user -> {wechatServer.registerObserver(user);});

        wechatServer.setMessage("aaa");


        wechatServer.setMessage("bbb");



    }

}
