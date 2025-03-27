package com.itheima.test4;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(",在吃" + food);
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
