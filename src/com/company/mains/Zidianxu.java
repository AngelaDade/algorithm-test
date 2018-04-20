package com.company.mains;

import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/19.
 */
public class Zidianxu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String inputString = scanner.next();
            solution(inputString);

        }



    }
    public static void solution(String inputString) {

        String result = "";
        for(int i=0; i<inputString.length(); i++) {
            String temp = inputString.substring(inputString.length()-i-1, inputString.length()-i) + result;
            if(temp.compareTo(result) > 0 ) {
                result = temp;
            }
        }
        System.out.println(result);
    }
}
