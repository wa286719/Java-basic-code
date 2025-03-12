package com.itheima.homework;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
         */

        //分析：定义数组并存入元素
        //定义中间变量temp，将arr[0]赋值给temp
        //遍历数组，使用if语句判断temp和数组元素大小
        //如果temp<数组元素，则将数组元素赋值给temp

        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};
        double temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println("数组最小值为：" + temp);
    }
}
