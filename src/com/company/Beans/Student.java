package com.company.Beans;

/**
 * Created by lipeiyuan on 2018/3/19.
 */
public class Student {
    private String name;
    private Long number;
    private String sex;
    public Student () {}
    public Student(String name) {
        this.name = name;
    }
    public Student(String name , Long number , String sex) {
        this.name = name;
        this.number = number;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof Student) {
            Student student = (Student)object;
            return student.getNumber().equals(number);
        } else {
            return false;
        }

    }

    @Override
    public int hashCode () {
        return 1;
    }

    public static int compare(Student student1 , Student student2) {
        return student1.getNumber().compareTo(student2.getNumber());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
