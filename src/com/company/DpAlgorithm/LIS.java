package com.company.DpAlgorithm;

/**
 * Created by lipeiyuan on 2018/4/16.
 * 最长递增子序列详解（longest increasing subsequence）
 * 状态转移方程为：dp(i)=max{dp(i),dp(j)+1}  if  j<i,A[j]<A[i]   ;   dp[i]表示以i为结尾的最长递增子序列的长度
 */
public class LIS {

    public static void main(String[] args) {
        int[] numbers = {1,3,2,6};
        getLIS(numbers);
    }


    public static int getLIS(int[] numbers) {

        int[] lis = new int[numbers.length];

        int[] dp = new int[numbers.length];

        int max = 1;

        if (numbers.length == 0 || numbers == null) {
            return 0;
        }
        for (int i = 0 ; i < numbers.length ; i++) {
            dp[i] = 1;
            for (int j =0 ; j < i ; j++) {
                if (numbers[j] < numbers[i]) {
                    //状态转移方程的体现，子结果被存储在dp[j]中，
                    // 当numbers[j] < numbers[i]时，dp[j]中加1的1指的是number[i],因为number[i]大比前面的大，所以给dp[j]加了1
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    max = Math.max(max,dp[i]);

                }
            }
        }
        System.out.println("最长子序列长度为===="+max);
        return max;
    }
}
