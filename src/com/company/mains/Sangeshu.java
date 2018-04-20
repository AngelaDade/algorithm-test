package com.company.mains;

import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/19.
 */
public class Sangeshu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int maxNumber = A;
        if(B>maxNumber){
            maxNumber=B;
        }
        if(C>maxNumber) {
            maxNumber = C;
        }
        int result = (maxNumber*3-A-B-C)/2;
        if((maxNumber*3-A-B-C)%2!=0) {
            result+=2;
        }
        System.out.println(result);
    }
}
