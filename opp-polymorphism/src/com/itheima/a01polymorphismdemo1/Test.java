package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(30);

        Administrator a = new Administrator();
        a.setName("王五");
        a.setAge(20);

        register(s);
        register(t);
        register(a);
    }

    //要让这个方法既能接收学生，也能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
