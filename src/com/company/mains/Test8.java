//package com.company.mains;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//
///**
// * Created by lipeiyuan on 2018/4/12.
// */
//public class Test8 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int n = random.nextInt(10) + 1;
//        while (scanner.hasNext()) {}
//        List<Long> xs = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            xs.add(scanner.nextLong());
//        }
//        for(Long x:xs) {
//            Long data = x;
//            Long max;
//            Long min;
//            List<Integer> prime = new ArrayList<>();
//            while (true) {
//                int i = 2;
//                Long a = data;
//                while (i<=a) {
//                    if(a % i == 0){
//                        a=a/i;
//                        prime.add(i);
//                    } else {
//                        i++;
//                    }
//                }
//                if(isLegal(prime)) {
//                    max = data;
//                    prime.clear();
//                    break;
//                }
//                prime.clear();
//                data++;
//            }
//            data = x;
//            while (true) {
//                int i = 2;
//                Long a = data;
//                while (i<=a) {
//                    if(a % i == 0){
//                        a=a/i;
//                        prime.add(i);
//                    } else {
//                        i++;
//                    }
//                }
//                if(isLegal(prime)) {
//                    min = data;
//                    prime.clear();
//                    break;
//                }
//                prime.clear();
//                data--;
//            }
//            if(Math.abs(max-x)==Math.abs(min-x)) {
//                System.out.println(min);
//            } else {
//                System.out.println(Math.abs(max-x)<Math.abs(min-x)?max:min);
//            }
//        }
//        public static boolean isLegal(List<Integer> list) {
//            for(Integer a:list) {
//                if(a!=2&&a!=3&&a!=5&&a!=7) {
//                    return false;
//                }
//            }
//            return true;
//        }
//}
