package com.itheima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        /*
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
         */

        //1.创建一个标准JavaBean
        //2.创建一个集合
        ArrayList<Student> list = new ArrayList<>();
        //3.创建学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        //4.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //5.遍历集合，打印对象
        for (int i = 0; i < list.size(); i++) {
            //这里要注意，因为Student类不是Java创建的，因此不能直接打印
            //直接打印会输出地址值，所以要调用get和set方法
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
