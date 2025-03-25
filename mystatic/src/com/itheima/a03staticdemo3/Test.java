package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建一个集合，存入三个学生对象
        ArrayList<Student> list = new ArrayList<>();

        //创建三个学生对象
        Student s1 = new Student("zhangsan",23,"男");
        Student s2 = new Student("lisi",24,"女");
        Student s3 = new Student("wangwu",25,"男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAge);
    }
}
