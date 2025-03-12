package com.itheima.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        //分析：首先定义数组存放五个元素
        //然后遍历数组得到每个元素
        //定义sum变量用于累加求和

        int[] arr  = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i依次表示数组里的每一个索引
            //arr[i]表示数组里的每一个元素
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
