package com.company.LeetCode;

/**
 * Created by lipeiyuan on 2018/5/22.
 * 1、String的trim方法可以去除字符串首尾的空格
 * 2、想要用char类型表面的意思 比如 char a = '8' 想要用到 8 的含义，那么可以用  a-'0' 表示8 ，如果直接a转为int，则值为其ASCII码
 */
public class LC8_StringToInteger {
    public static void main(String[] args) {
        String a = "2147483648";
        System.out.println("MAX:"+Integer.MAX_VALUE);
        LC8_StringToInteger lc8_stringToInteger = new LC8_StringToInteger();
        System.out.println(lc8_stringToInteger.myAtoi(a));

    }

    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        long result = 0;
        String temp  = str.trim();
        if (temp.length()==0){
            return 0;
        }
        //标注是否为正数
        boolean isPositive = true;
        for (int i = 0 ; i < temp.length() ; i++) {
            char currentChar = temp.charAt(i);
            if (i == 0 && (currentChar == '-'||currentChar == '+')) {
                isPositive = currentChar=='-'? false : true;

            } else if (currentChar >= '0' && currentChar <= '9') {

                result = result*10 + (currentChar-'0');
                //判断是否在int的范围内(要放在加到result后面)
                if ((isPositive == true && result > Integer.MAX_VALUE) || (isPositive == false && -result < Integer.MIN_VALUE)) {
                    return isPositive? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

            } else {    //不是表示数字的字符，直接返回
                break;
            }

        }
//        System.out.println(result);
//        return isPositive==true ? (int)result : (int)-result;
        if (isPositive){
            System.out.println(result);
            return (int) result;
        }else {
            return (int) result;
        }

    }
}
