package com.company.mains;

import com.company.StackAndQueue.StackImplQueue;

/**
 * Created by lipeiyuan on 2018/3/26.
 */
public class StackMain {
    public static void main(String[] args) {
        StackImplQueue stackImplQueue = new StackImplQueue();
        for (int i = 1 ; i < 6 ; i++) {
            stackImplQueue.push(i);
        }

        System.out.println("出队列的顺序：");

        for (int i = 1 ; i < 6 ; i++) {
            try {
                System.out.print(stackImplQueue.pop());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
