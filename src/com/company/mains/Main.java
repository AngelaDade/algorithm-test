package com.company.mains;



import java.util.Scanner;
public class Main {

    static int lastResult = 0;
    static int type = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        type = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] min = new int[type];
        int[] max = new int[type];
        for (int i = 0 ; i < type ; i++) {
            min[i] = scanner.nextInt();
            max[i] = scanner.nextInt();
            sum -= min[i];
            max[i] -= min[i];
        }
        solution(0,sum,max);
        System.out.println(lastResult);

    }
    public static void solution(int left , int sum , int[] max) {

        if (sum < 0) {
            return;
        }
        if (sum == 0) {
            lastResult++;
            return;
        }
        if (sum > 0) {
            if (left >= type) {
                return;
            }
            for (int i= 0 ; i <= max[left] ; i++) {
                solution(left+1 , sum - i , max);
            }
        }




    }
}