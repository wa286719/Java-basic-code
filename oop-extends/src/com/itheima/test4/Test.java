package com.itheima.test4;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Dog d = new Dog();
        d.setColor("蓝色");
        d.setAge(3);
        d.lookHome();
        Cat c = new Cat();
        c.setColor("白色");
        c.setAge(2);
        c.catchMouse();

        p.keepPet(d,"狗粮");
        p.keepPet(c,"小鱼干");
    }
}
