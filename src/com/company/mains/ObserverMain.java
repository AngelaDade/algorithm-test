package com.company.mains;

import com.company.Beans.Observer.Observer;
import com.company.Beans.Observer.User;
import com.company.Beans.Subject.Subject;
import com.company.Beans.Subject.WechatServer;

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
