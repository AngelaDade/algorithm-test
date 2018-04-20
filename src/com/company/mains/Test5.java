package com.company.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/11.
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char[] charArray = sc.nextLine().toCharArray();
            char[] tmpCharArray = new char[300];
            for(int i = 0 ; i<charArray.length;i++){
                tmpCharArray[charArray[i]]++;
            }
            int arrayLength = charArray.length;
            StringBuilder stringBuilder = new StringBuilder();
            while(arrayLength>0) {
                for(int i = Integer.valueOf(' ') ;i<tmpCharArray.length;i++){
                    if(tmpCharArray[i]!=0){
                        stringBuilder.append((char)i);
                        tmpCharArray[i]--;
                    }
                }
                arrayLength--;
            }
            System.out.println(stringBuilder.toString());
        }

    }

}
