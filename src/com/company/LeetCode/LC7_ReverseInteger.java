package com.company.LeetCode;

/**
 * Created by lipeiyuan on 2018/5/9.
 *  求x的最后一位： last = x % 10
 *  求x的除了最后一位剩余的： m = x / 10
 *  思路：通过求商求余数法进行操作
 *
 */
public class LC7_ReverseInteger {

    public static void main(String[] args) {
        LC7_ReverseInteger lc7_reverseInteger = new LC7_ReverseInteger();
        int result = lc7_reverseInteger.reverse(120);
        System.out.println(result);

    }
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result*10 + x%10;
            x = x/10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
