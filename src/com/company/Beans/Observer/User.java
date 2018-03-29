package com.company.Beans.Observer;

/**
 * Created by lipeiyuan on 2018/3/29.
 */
//普通用户可以作为观察者，对wechatServer来进行观察
public class User implements Observer {
    private String message;
    private String name;
    public User (String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        this.message = message;
        System.out.println("观察者"+this.name+"收到推送消息------"+message);
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
