package com.company.mains;


import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String x = scanner.nextLine();
            String[] a;
            String[] b;
            a = scanner.nextLine().split(" ");
            b = scanner.nextLine().split(" ");
            System.out.println(x);
            Arrays.stream(a).forEach(s -> {System.out.print(s);});
            System.out.println();
            Arrays.stream(b).forEach(s -> {System.out.print(s);});


        }


    }


}

