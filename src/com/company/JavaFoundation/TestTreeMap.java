package com.company.JavaFoundation;


import java.util.*;

/**
 * Created by lipeiyuan on 2018/5/13.
 */
public class TestTreeMap {

    public static void main(String[] args) {
        Map<Integer , String> map = new TreeMap<Integer , String>((integer1 , integer2) -> {
            return integer1.compareTo(integer2);
        });
        map.put(1,"b");
        map.put(12,"a");


        for (Map.Entry<Integer , String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ",value: " + entry.getValue());
        }

        List<Map.Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (entry1 , entry2) -> {
            return entry1.getValue().compareTo(entry2.getValue());
        });
        entries.stream().forEach(entry -> {System.out.println("key: " + entry.getKey() + ",value: " + entry.getValue());});

    }
}
