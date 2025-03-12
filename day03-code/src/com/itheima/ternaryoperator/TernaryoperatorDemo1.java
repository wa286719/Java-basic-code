package com.itheima.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //使用三元运算符，获取两个数的较大值
        //三元运算符的结果必须要被使用，要么被赋值，要么被打印
        int number1 = 10;
        int number2 = 20;
        int max = number1 > number2 ? number1 : number2;
        System.out.println(number1 > number2 ? number1 : number2);
    }
}
