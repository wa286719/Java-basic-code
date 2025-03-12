package com.itheima.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开
         */

        //分析：定义数组存入数据
        //遍历数组，使用System.out.print打印中间加空格

        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}
