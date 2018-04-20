package com.company.mains;

/**
 * Created by lipeiyuan on 2018/4/10.
 */
public class Test4 {
    public static void main(String[] args) {
        char[] chars = {'a','b'};
        char[] charsArray = new char[256];
        System.out.println(Integer.valueOf(' '));
        charsArray[chars[0]] = 'x';
        System.out.println(charsArray[97]);
    }
}
