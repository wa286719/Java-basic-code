package com.itheima.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //编译看左边，运行看右边
        Animal a = new Dog();

        //多态的弊端
        //不能调用子类的特有功能，即子类中定义的非继承方法
        //a.lookHome();报错
        //为什么呢？
        //调用成员方法时，编译看左边，运行看右边
        //在编译时会检查左边的父类中有没有这个方法，如果没有就会报错

        //解决方法
        //将类型强制转回子类即可
        //细节：转换时不能转成其他类型，否则会报错
        //如何检查变量是什么类型

/*        if(a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHome();
        } else if(a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else{
            System.out.println("没有这个类型，无法转换");
        }*/

        //新特性
        //先判断a是否为Dog类型，如果是，将a强转回Dog类型，让其变成真正的Dog类型，转换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if(a instanceof Dog d) {
            d.lookHome();
        } else if(a instanceof Cat c) {
            c.catchMouse();
        } else{
            System.out.println("没有这个类型，无法转换");
        }
    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗在吃骨头");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫在吃小鱼干");
    }

    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}