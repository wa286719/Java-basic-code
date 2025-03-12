package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求：设计一个方法用于获取数组中元素的最大值
         */

        //分析：
        //1.要干什么？获取数组中的最大值
        //2.需要什么？在方法中遍历数组，并获取最大值
        //定义max变量用于存放最大值，使用if语句判断，将大的值赋值给max
        //3.调用方法处是否需要使用方法的结果？不需要

        int[] arr = {12, 45, 98, 73, 60};
        getMax(arr);
    }

    public static void getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
