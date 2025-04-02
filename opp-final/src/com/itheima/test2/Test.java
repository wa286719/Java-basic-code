package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        /*
        final修饰的变量是基本类型：那么变量存储的数据值不能发生改变
        final修饰的变量是引用类型：那么变量存储的地址值不能发生改变，但是对象内部的值可以改变
         */

        //final修饰的变量名要全部大写
        final double PI = 3.14;
        //final修饰的变量值无法改变
        //PI = 3;

        final Student S = new Student("张三", 20);
        //final修饰的引用数据类型，其地址值无法改变，但是对象内部的值是可以改变的
        S.setAge(23);
        S.setName("李四");
        //下面这个就无法改变了
        //S = new Student();

        //数组也一样
        final int[] ARR = {1, 2, 3, 4, 5};
        //修改数组内部的值没有问题
        ARR[0] = 10;
        ARR[1] = 20;
        //但是如果重新创建数组就会报错
        //ARR = new int[10];
    }
}
