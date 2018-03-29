package com.company.Beans;

/**
 * Created by lipeiyuan on 2018/3/28.
 */
public class TestStatic {
    public static int i = 1;
    public static int add() {
        return i+1;
    }
    public int objectAdd() {
        return i+1;
    }
}
