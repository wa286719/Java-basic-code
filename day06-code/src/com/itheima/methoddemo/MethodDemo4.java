package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //目标：掌握带参数方法定义和调用的格式

        getSum(10,20);
    }

    public static void getSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
