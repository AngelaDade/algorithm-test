package com.company.JavaFoundation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lipeiyuan on 2018/5/9.
 * 关于java闭包
 */
public class TestClosure {
    public static void main(String[] args) {
        Food food = new Food();
        food.showCurrentNum();
        food.getEat().eat();
        food.showCurrentNum();
        food.getEat2().eat();
        food.showCurrentNum();
        food.getEat3().eat();
        food.showCurrentNum();
    }
}

interface Active{
    void eat();
}

class Food{
    public static final String name = "Food";
    private  int num = 20;

    public Food() {
        System.out.println("Delicious Food");
    }

    //内部类
    private class EatActive implements Active {
        @Override
        public void eat() {
            if (num == 0) {
                System.out.println("吃货，已经吃没了");
            }
            num --;
            System.out.println("吃货，你吃了一份了");
        }
    }

    public Active getEat() {
        return new EatActive();
    }
    public void showCurrentNum() {
        System.out.println("还剩"+num+"份食物");
    }

    //使用匿名内部类
    public Active getEat2() {
        return new Active() {
            @Override
            public void eat() {
                System.out.println("调用匿名内部类-----------");
                if (num == 0) {
                    System.out.println("吃货，已经吃没了");
                }
                num --;
                System.out.println("吃货，你吃了一份了");
            }
        };
    }

    //使用lambda表达式
    public Active getEat3() {
        //保存在 栈 中
        int  localVal = 1;
        //保存在 堆 中
        List<Integer> integerList = new ArrayList<>();

        TestObj testObj = new TestObj();


        Active eatActive = () -> {
            System.out.println("调用lambda函数--------------");
            if (num == 0) {
                System.out.println("吃货，已经吃没了");
            }
            num --;
            System.out.println("吃货，你吃了一份了");
            System.out.println(localVal);
            integerList.add(1);
            testObj.setVal("bb");

        };
        return eatActive;
    }

}

class TestObj {
    private String val;
    public TestObj() {
        val = "a";
    }
    public void setVal(String val) {
        this.val = val;
    }
}
