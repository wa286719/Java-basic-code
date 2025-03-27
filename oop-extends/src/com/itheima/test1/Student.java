package com.itheima.test1;

public class Student extends Character{
    private String classRoom;

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public void fillForm() {
        System.out.println("填写听课反馈");
    }
}
