package com.itheima.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
         */

        // 分析：
        // 1.要比较两个数得到较小值并返回
        // 2.需要两个数字
        // 3.需要返回值

        System.out.println("较小值为：" + getMin(5.9,6.8));
    }
    //定义double类型getMin方法，有两个形参
    //定义min
    //使用三元运算符，将较小值赋值给min，并返回min
    public static double getMin(double num1, double num2) {
        double min;
        min = num1 > num2 ? num2 : num1;
        return min;
    }
}
