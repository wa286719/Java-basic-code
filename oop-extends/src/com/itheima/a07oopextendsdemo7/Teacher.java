package com.itheima.a07oopextendsdemo7;

public class Teacher extends Employee {
    //这里也需要构造方法，如果没有有参构造的话，子类无法有参构造
    public Teacher() {
    }

    public Teacher(String id, String name, String work) {
        super(id, name, work);
    }
}
