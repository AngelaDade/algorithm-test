package com.company.mains;

import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/10.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String number1 = scanner.next();
            String number2 = scanner.next();
            MySolution mySolution = new MySolution();
            System.out.println(mySolution.multiply(number1, number2));
        }
    }


}
class MySolution{
    public static String multiply(String num1, String num2){

        char charArray[] = num1.toCharArray();
        char charArray2[] = num2.toCharArray();


        int result[] = new int[charArray.length + charArray2.length];
        int n1[] = new int[charArray.length];
        int n2[] = new int[charArray2.length];


        for(int i = 0; i < charArray.length;i++)
            n1[i] = charArray[i]-'0';
        for(int i = 0; i < charArray2.length;i++)
            n2[i] = charArray2[i]-'0';


        for(int i =0 ; i < charArray.length; i++){
            for(int j =0; j < charArray2.length; j++){
                result[i+j]+=n1[i]*n2[j];
            }
        }


        for(int i =result.length-1; i > 0 ;i--){
            result[i-1] += result[i] / 10;
            result[i] = result[i] % 10;
        }


        String resultStr = "";
        for(int i = 0; i < result.length-1; i++){
            resultStr+=""+result[i];
        }
        return resultStr;
    }
}
