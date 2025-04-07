package com.itheima.a01abstractdemo1;

public abstract class Animal {

    private String name;
    private int age;

    //抽象类中也可以有构造方法，虽然抽象类无法实例化，但可以在子类创建对象时给属性进行赋值


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void drink(){
        System.out.println("喝水");
    }

    //定义抽象方法不需要方法体，有抽象方法的类一定是抽象类
    public abstract void eat();
}
