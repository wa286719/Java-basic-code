package com.itheima.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        //分析：首先定义数组，存入十个数据
        //定义count变量用于计数
        //然后遍历数组
        //使用if语句判断是否能被三整除，如果可以count++

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
