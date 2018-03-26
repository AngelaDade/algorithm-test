package com.company.StackAndQueue;

import java.util.Stack;

/**
 * Created by lipeiyuan on 2018/3/26.
 */
public class StackImplQueue  {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push (int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (!stack2.isEmpty()) {
            int node = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return node;
        } else {
            throw new Exception("队列为空");

        }

    }


}
