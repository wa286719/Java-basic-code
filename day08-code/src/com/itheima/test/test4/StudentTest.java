package com.itheima.test.test4;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的空参构造
        //如果在创建对象时不知道成员变量值，就使用空参构造
        //如果创建了有参构造，则系统不会提供默认无参构造，需要自己定义
        //Student s = new Student();

        Student s = new Student("张三", 25);
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
