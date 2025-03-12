package com.itheima.homework;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        定义一个方法，该方法能够找出三个整数中的最大值并返回。
        在主方法中调用方法测试执行。
         */

        //分析：
        //1.要找出三个整数中的最大值并返回
        //2.需要三个整数
        //3.有返回值
        int max = getMax(98,68,103);
        System.out.println("最大值是：" + max);
    }
    //定义int类型方法getMax来获取最大值，带三个形参num1,num2,num3
    //比较三个数大小，先定义max用于存放最大值
    //假定num1是最大值，将其赋值给max
    //如果num2>max则max = num2，如果num3>max则max = num3

    public static int getMax(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
