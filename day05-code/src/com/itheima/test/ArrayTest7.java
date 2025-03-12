package com.itheima.test;

import java.util.Random;

public class ArrayTest7 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
         */

        //分析：先定义数组，存入1~5
        //使用随机数来打乱，定义随机数
        //遍历数组，将arr[r]和arr[i]交换位置
        //不能直接赋值，而是用交换位置的方法
        //定义一个中间变量temp用于交换位置

        int[] arr = {1,2,3,4,5};
        Random r = new Random();
        int number = r.nextInt(arr.length);
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
