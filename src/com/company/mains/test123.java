package com.company.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lipeiyuan on 2018/4/19.
 */
public class test123 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int N = scanner.nextInt();
            List<List> allInput = new ArrayList();
            for (int i = 0 ; i < N ; i++) {
                long n = scanner.nextLong();
                List<Long> arr = new ArrayList<>();
                for (int j = 0 ; j < n ; j++) {
                    arr.add(scanner.nextLong());
                }
                allInput.add(arr);

            }
            solution(allInput);

        }

    }
    public static void solution(List<List> allInput){
        for (int i = 0 ; i < allInput.size() ; i++) {
            ArrayList<Long> rowList = (ArrayList<Long>) allInput.get(i);
            List<Long> potentialT = new ArrayList<>();
            long t = 1;
            while (true) {

                long right = rowList.get(rowList.size()-1)-t;
                long left = rowList.get(0)+t;
                if(left <= right) {
                    int satifyNum = 0;
                    for (int j = 0 ; j < rowList.size() ; j++) {
                        if (rowList.get(j) >= left && rowList.get(j) <= right) {
                            satifyNum++;
                        }else { break;}

                    }
                    if (satifyNum == rowList.size()) {
                        System.out.println(t);
                        break;
                    }
                }

                t++;
            }


        }
    }
    }

