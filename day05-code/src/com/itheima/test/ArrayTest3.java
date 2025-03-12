package com.itheima.test;

public class ArrayTest3 {
    public static void main(String[] args) {
        //分析：首先定义数组存放十个数据
        //然后遍历数组得到数据
        //用if语句判断数组元素对2取余是否为0
        //如果为0，则存入原数据的二分之一
        //如果不为0，则原数据乘二

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                //这里用arr[i] = arr[i] / 2 更好
                //整数除法得到结果还是整数
                //还不用变成double
                arr[i] = arr[i] / 2;
            } else {
                arr[i] = 2 * arr[i];
            }
        }
        //一个循环只做一件事情
        //不能既改变数据值，又遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
