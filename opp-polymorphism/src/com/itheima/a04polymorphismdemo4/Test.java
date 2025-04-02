package com.itheima.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 30);
        Animal a = new Dog();
        a.setAge(2);
        a.setColor("黑色");
        Animal b = new Cat();
        b.setAge(3);
        b.setColor("灰色");
        p.keepPet(a, "骨头");
        p.keepPet(b, "🐟");
        Dog d = (Dog) a;
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    //用一个方法能接受所有的动物，因此这个方法的形参要写这些类的父类Animal
    //如果还想在keepPet中调用子类的独特方法，可以用if语句判断并强转
    public void keepPet(Animal a, String something) {
        if(a instanceof Dog d) {
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的狗");
            d.eat(something);
            d.lookHome();
        } else if(a instanceof Cat c) {
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的狗");
            c.eat(something);
            c.catchMouse();
        }


    }
}

class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something) {
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
