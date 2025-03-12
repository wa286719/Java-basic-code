package com.itheima.test;

public class ArrayTest4 {
    public static void main(String[] args) {
        /*
        需求：求数组中的最大值
         */

        //为什么temp初始化值不能为0呢？temp = 0
        //如果数组中有负数，那最终输出的最大值就是0
        //因此temp初始化值一定要是数组里的值arr[]


        //分析：定义数组并存储数据
        //定义temp变量用于临时存放数组元素
        //遍历数组，赋值给temp，再和下一个元素比大小

        int[] arr = {33,5,22,44,55};


        //先默认arr[0]是最大的赋值给temp
        int temp = arr[0];
        //遍历就从1开始，和下面遍历从0开始一个道理
        for (int i = 1; i < arr.length ; i++) {
            temp = arr[i];
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }


        /*for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            if (temp < arr[i + 1]) {
                temp = arr[i + 1];
            }
        }*/
        System.out.println(temp);
    }
}
