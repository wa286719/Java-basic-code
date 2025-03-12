package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //从键盘录入学生信息
        //1.创建集合对象
        ArrayList<Student> list = new ArrayList<>();
        //2.创建循环然后录入学生信息
        //!!!!!!!注意这里，不能用i<list.size()
        //因为此时集合的长度为0，而是应该用i<3，录入三个学生对象
        //3.键盘录入信息
        //!!!!!!!!!!
        //！！！！！！！！！！！！
        //注意：如果Student s = new Student();创建学生对象放在循环外面
        //那list.add始终加的是同一个学生对象s的地址值，在循环中修改的也始终是同一个s
        //因为add加的是地址值，所以一旦s发生改变，那list最终输出的数据也改变
        //而在循环里面，每次循环都会创建一个新的学生对象，所以输出正确结果
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
