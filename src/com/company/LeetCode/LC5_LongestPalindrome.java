package com.company.LeetCode;

/**
 * Created by lipeiyuan on 2018/4/25.
 * 最长回文子串
 * 解法一：暴力法，求出所有子串，判断子串中最长的回文串，判断回文串可以从串的两边往中间比较
 * 解法二：状态转移，转移方程： dp[ i ][ j ] = dp[ i + 1][ j - 1] && s[ i ] == s[ j ]
 */
public class LC5_LongestPalindrome {

    public static void main(String[] args) {
        String s = "aaabaaaa";
        LC5_LongestPalindrome lc5_longestPalindrome = new LC5_LongestPalindrome();
        String s_result = lc5_longestPalindrome.longestPalindrome(s);
        System.out.println(s_result);
        String result2 = lc5_longestPalindrome.longestPalindrome2(s);
        System.out.println(result2);
        String result3 = lc5_longestPalindrome.longestPalindrome3(s);
        System.out.println(result3);

    }
    //暴力解法, leetcide 会超时 o(n^3)
    public String longestPalindrome(String s) {
        String result = null;
        //存储最大子串的长度
        int resultLength = 0;
        int resultStart = 0;
        if (s.equals(null)) {
            return result;
        }

        for (int start = 0 ; start < s.length() ; start++) {
            for (int end = start ; end < s.length() ; end++) {
                //判断是否是回文
                int left = start , right = end;
                for (; left < right ; left++ , right--) {
                    if (s.charAt(left) != s.charAt(right)) {
                        break;
                    }


                }
                if (left > right || left == right) {
                    //只有更改resultLength为更大的时候才需要更改resultStart
                    if (resultLength < end - start +1) {
                        resultLength = end - start +1;
                        resultStart = start;
                    }
                }
            }
        }
        result = s.substring(resultStart,resultStart+resultLength);

        return result;
    }
    //动态规划 O(n^2)

    public String longestPalindrome2(String s) {

        String result = null;

        int resultStart = 0;
        int resultLength = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        //通过dp[left][right]中的left和right的差距来判断子串长度
        //先初始化长度为1和2的子串
        for (int i = 0 ; i < s.length() ; i++) {
            //子串长度为1的全是回文串
            dp[i][i] = true;
            resultLength = Math.max(resultLength,1);
            //子串长度为2的
            if (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
                dp[i][i+1] = true;
                resultLength =2;
                //因为长度是从小变大的，所以每次为true时都可以吧start赋值给最新的
                resultStart = i;
            }
        }
        // 使用上述结果可以dp出子串长度为3~len -1的子串
        for (int childLength = 3 ; childLength <= s.length() ; childLength++) {
            for (int left = 0 ; left <= s.length()-childLength ; left++) {
                int right = left + childLength -1;
                if (dp[left+1][right-1] == true && s.charAt(left) == s.charAt(right)) {
                    dp[left][right] = true;
                    resultLength = childLength;
                    resultStart = left;
                }
            }
        }
        result = s.substring(resultStart,resultStart+resultLength);



        return result;
    }


    //从中心向两边扩展
    public String longestPalindrome3(String s) {

        String result = null;
        int resultStart = 0;
        int resultLength = 1;
        // String s = null;用s.length()报空指针，String s = "" ；  s.length()为0
        if (s.length()==0||s==null) {
            return null;
        }

        //对于像aba这种
        for (int center = 0 ; center < s.length() ; center++) {
            int left = center-1;
            int right = center+1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (resultLength < right-left+1) {
                    resultLength = right-left+1;
                    resultStart = left;
                }
                left--;
                right++;
            }
        }

        //对于像abba这种
        for (int i = 0  ; i < s.length() ; i++) {
            int left = i;
            int right = i+1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (resultLength < right-left+1) {
                    resultLength = right-left+1;
                    resultStart = left;
                }
                left--;
                right++;
                System.out.println();


            }
        }
        result = s.substring(resultStart,resultStart+resultLength);
        return result;

    }


















}
