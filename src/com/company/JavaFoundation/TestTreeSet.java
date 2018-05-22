package com.company.JavaFoundation;

import com.company.Beans.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lipeiyuan on 2018/5/10.
 */
public class TestTreeSet {
    public static void main(String[] args) {

        Set<Animal> treeSet1 = new TreeSet<Animal>((animal1 , animal2) -> {
            if (animal1.getNumber() > animal2.getNumber()) {
                return 1;
            } else if (animal1.getNumber() < animal2.getNumber()) {
                return -1;
            } else {
                return 0;
            }
        });


        //对于lambda中复写CompareTo,  返回 1 的话不改变存入ArrayList的顺序，返回 -1 返序取出， 返回0 只能存一个值
        Set<Animal> treeSet2 = new TreeSet<Animal>((animal1 , animal2) -> {
            return 1;
        });


        List<Animal> animalList = new ArrayList<>();
        Animal animal1 = new Animal(1,"a");
        Animal animal2 = new Animal(2,"b");
        Animal animal3 = new Animal(3,"cc");

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        System.out.println("arrayList中的元素：   ");
        animalList.stream().forEach(animal -> {System.out.print(animal.getName()+"  ");});


        System.out.println();

        treeSet1.addAll(animalList);

        System.out.println("treeSet1中元素：  ");
        treeSet1.stream().forEach(animal ->{System.out.print(animal.getName()+"  ");});

        System.out.println();
        System.out.println("treeSet2中元素：  ");
        treeSet2.addAll(animalList);
        treeSet2.stream().forEach(animal -> {System.out.print(animal.getName()+"  ");});

        //想要按number正序排序
        Set<Animal> animalSet = new TreeSet<Animal>((a1 , a2) -> {
            if (a1.getNumber() < a2.getNumber()) {
                return -1;
            } else {
                return 1;
            }
        });
        System.out.println();
        animalSet.add(animal2);
        animalSet.add(animal1);
        animalSet.add(animal3);
        System.out.println("treeSet3中元素：  ");
        animalSet.stream().forEach(animal -> {System.out.print(animal.getName()+"  ");});

        Set<Animal> animalSet4 = new TreeSet<Animal>((Animal a1, Animal a2) -> 1);
        animalSet4.add(animal1);
        animalSet4.add(animal2);
        animalSet4.add(animal3);
        System.out.println();
        System.out.println("treeSet4中元素：  ");
        animalSet4.stream().forEach((animal -> System.out.println(animal.getName())));
        animalSet4.stream().filter(animal -> animal.getNumber()==1);
        System.out.println();
        System.out.println("更改后treeSet4中元素：  ");
        animalSet4.stream().forEach(animal -> System.out.println(animal.getName()));


    }
}
