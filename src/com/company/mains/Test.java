package com.company.mains;

import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/10.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int k = scanner.nextInt();
            int a = scanner.nextInt();
            int x = scanner.nextInt();
            int b = scanner.nextInt();
            int y = scanner.nextInt();
            int[][][] dp = new int[1001][101][101];
            dp[0][0][0] = 1;
            long s = 0;
            long[][] c = new long[101][101];
            c[0][0] = 1;
            for(int i = 1 ; i <= 100 ; i++) {
                c[i][0] = 1;
                c[i][i] = 1;
                for (int j = 1 ; j < i ; j++) {
                    c[i][j] = (c[i-1][j]+c[i-1][j-1])%1000000007;
                }
            }
            for (int length = 1 ; length <= k ; length++) {
                for (int i = 0 ; i <= x ; i++) {
                    for (int j = 0 ; j <= y ; j++) {
                        int tempa = 0;
                        if (length >= a && i >= 1) {
                            tempa = dp[length-a][i-1][j];
                        }
                        int tempb = 0;
                        if (length >= b && j >= 1) {
                            tempb = dp[length-b][i][j-1];
                        }
                        if (tempa == 1 || tempb == 1) {
                            dp[length][i][j] = 1;
                        }
                        if (length == k) {
                            s = (s+(dp[length][i][j]*c[x][i])%1000000007*c[y][j])%1000000007;


                        }
                    }
                }
            }
            System.out.println(s);


        }


    }
}
