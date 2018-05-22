package com.company.Beans;

/**
 * Created by lipeiyuan on 2018/5/10.
 */
public class Animal {
    private int number;
    private String name;
    public Animal(int number , String name){
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
