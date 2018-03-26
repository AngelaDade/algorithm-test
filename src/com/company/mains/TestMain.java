package com.company.mains;


import java.util.Stack;

/**
 * Created by lipeiyuan on 2018/3/23.
 */
public class TestMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
