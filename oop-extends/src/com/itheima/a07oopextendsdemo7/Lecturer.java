package com.itheima.a07oopextendsdemo7;

public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("Lecturer在上课");
    }
}
