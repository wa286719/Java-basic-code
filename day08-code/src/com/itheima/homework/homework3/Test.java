package com.itheima.homework.homework3;

public class Test {
    public static void main(String[] args) {
        /*
        定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
         */
        Manager manager = new Manager("张三", 123, 15000, 6000);
        Coder coder = new Coder("李四", 135,10000);
        manager.work();
        coder.work();
    }
}
