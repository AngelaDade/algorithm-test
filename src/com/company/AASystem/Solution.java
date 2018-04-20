package com.company.AASystem;

import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by lipeiyuan on 2018/4/15.
 */
public class Solution {
    public static void solution(double jing , double yang , double xuan , double yuan){
        double allPay = jing+yang+xuan+yuan;
        double[] everyPay = new double[4];
        everyPay[0] = jing;
        everyPay[1] = yang;
        everyPay[2] = xuan;
        everyPay[3] = yuan;
        double avg = allPay/4;
        Executors.newFixedThreadPool(4);

    }
}
