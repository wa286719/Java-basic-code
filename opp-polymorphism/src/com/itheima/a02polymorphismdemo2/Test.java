package com.itheima.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象（多态方式）
        Animal a = new Dog();
        //调用成员变量：编译看左边，运行也看左边
        //编译看左边：javac在编译代码的时候，会看左边父类中有没有这个变量，如果有，则编译成功，如果没有则编译失败
        //运行看左边：java运行代码时，实际获取的是左边父类中成员变量的值
        System.out.println(a.name);

        //调用成员方法：编译看左边，运行看右边
        //编译看左边：javac在编译代码的时候，会看左边父类中有没有这个变量，如果有，则编译成功，如果没有则编译失败
        //运行看右边：java运行代码时，实际上运行的是子类中的方法
        a.show();

        //理解：
        //Animal a = new Dog();
        //现在用a去调用变量和方法吗？是的
        //而a是Animal类型的，所以默认会从Animal这个类中去找

        //如果是Dog d = new Dog()
        //那在调用d.name时会先看子类中有没有name变量，没有的话在去从父类继承下来的变量中查找

        //成员变量：在子类的对象中，会把父类的成员变量也继承下的父：name  子：name
        //成员方法：如果子类对方法进行了重写，那么在虚方法表中是会把父类的方法进行覆盖的
    }
}

class Animal{
    String name = "Animal";

    public void show() {
        System.out.println("Animal --- show");
    }
}

class Cat extends Animal{
    String name = "Cat";

    @Override
    public void show() {
        System.out.println("Cat --- show");
    }
}

class Dog extends Animal{
    String name = "Dog";

    @Override
    public void show() {
        System.out.println("Dog --- show");
    }
}
