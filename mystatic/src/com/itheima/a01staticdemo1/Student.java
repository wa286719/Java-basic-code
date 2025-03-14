package com.itheima.a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    //static表示静态修饰符，被它修饰的变量叫静态变量
    //静态变量被同一个类中的所有对象共享，调用时使用类名.静态变量调用
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show(){
        System.out.println(name + ", " + age + ", " + gender  + ", " + teacherName);
    }
}
