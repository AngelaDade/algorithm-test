package com.company.JavaFoundation;

import com.company.Beans.Node;

/**
 * Created by lipeiyuan on 2018/5/13.
 */
public class TestFinal {
    final Node node = new Node();
    public static void main(String[] args) {
        String a = "hello2";
        final String fh = "hello";
        String h = "hello";
        String b = fh+2;
        String c = h+2;
        String d = "hello2";
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(a==d);

        String x = new String("hello");
        String y = new String("hello");
        System.out.println(x==y);

    }

//    void test(){
//        node = new Node("a" ,null , null);
//    }
}
