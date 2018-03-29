package com.company.mains;


import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x1[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            y1[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            x2[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            y2[i] = scanner.nextInt();
        }




    }

    public int getNumber(int n , int[] x1 , int[] y1 , int[] x2 , int[] y2){
        if (n == 0 || n == 1) {
            return 0;
        }
        else {
            int number = 0;
            return number;
        }

    }
}
