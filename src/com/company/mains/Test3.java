package com.company.mains;

import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/10.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        jumps(arr);

    }
    public static int jumps(int[] numbers) {
        int maxStep = 0;
        int max = 0;
        int a = 0;
        for (int i = 0 ; i < numbers.length-1 ; i++) {
            max = Math.max(max,i+numbers[i]);
            if (i == maxStep) {
                maxStep = max;
                a++;
            }
        }
        System.out.println(a);
        return a;
    }
}
