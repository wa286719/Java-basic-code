package com.itheima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*
        定义数组存储班级中50人的姓名，
        姓名未知，等后续添加
         */

        //格式
        //数据类型[] 数组名 = new 数据类型[数组的长度]

        String[] arr = new String[50];
        //添加学生
        arr[0] = "长得帅";
        arr[1] = "老李";
        System.out.println(arr[0]);
        System.out.println(arr[2]);//打印默认初始化值null

        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：默认初始化值'/u0000'即空格
        //布尔类型：默认初始化值false

        int[] arr2 = new int[3];
        System.out.println(arr[0]);
    }
}
