package com.itheima.test4;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String food) {
        System.out.println(",在吃" + food);
    }

    public void lookHome() {
        System.out.println("看家");
    }

}
