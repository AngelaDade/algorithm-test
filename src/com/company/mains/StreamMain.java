package com.company.mains;

import com.company.Beans.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lipeiyuan on 2018/3/21.
 */
public class StreamMain {

    public static void main (String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = new Student("aaa",new Long(1),"男");
        Student stu2 = new Student("bbb",new Long(2),"女");
        Student stu3 = new Student("ccc",new Long(3),"男");
        Student stu4 = new Student("ddd",new Long(4),"女");
        Student stu5 = new Student("eee",new Long(5),"男");
        Student stu6 = stu5;
        Student stu7 = new Student("ddd",new Long(4),"女");

        students.add(stu4);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        students.add(stu5);
        students.add(stu6);
        students.add(stu7);


        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(3);
        ints.add(3);
        ints.add(2);
        ints.add(1);



//        students.stream().filter(student -> student.getSex().equals("男")).forEach(student -> System.out.println("性别为男的学生---"+student.getName()));
//
//        ints.stream().distinct().forEach(integer -> System.out.println(integer));
//
//        students.stream().distinct().forEach(student -> System.out.println("stuNumber-----"+student.getNumber()));
        students.stream().map(student -> student.getNumber()).forEach(i -> System.out.println(i));

//        Stream.concat(Stream.of(5,4,2),Stream.of(3,1,2)).distinct().sorted().forEach(i -> System.out.print(i+","));
//        System.out.println();
//        Stream.of(1,2,3).map(i -> i*i).forEach(i -> System.out.print(i+","));
//        System.out.println();

//        Stream.of(1,2,3).skip(2).forEach(i -> System.out.println(i));
//        Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped value: " + e))
//                .forEach(s -> System.out.println(s));
//        Stream.of("one", "two", "three", "four")
//                .filter(e -> e.length() > 3)
//                .peek(e -> System.out.println("Filtered value: " + e))
//                .forEach(s -> System.out.println(s));
        Student studentTest = new Student();
        studentTest.setName("a");
        System.out.println(studentTest.getName()!=null);

        students.stream().forEach(student -> System.out.print(student.getNumber()+"--->"));
        System.out.println();
        //sort方法默认升序排列，也就是Comparator返回-1，sort升序
        //lambda方式
//        students.sort((student1,student2) -> {return student2.getNumber().compareTo(student1.getNumber());});
        //method reference方式
        students.sort(Student::compare);
        students.stream().forEach(student -> System.out.print(student.getNumber()+"--->"));
        System.out.println();
        System.out.println(stu1.getNumber().compareTo(stu2.getNumber()));



    }
}
