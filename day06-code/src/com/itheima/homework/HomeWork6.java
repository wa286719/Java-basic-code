package com.itheima.homework;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个方法equals(int[] arr1,int[] arr2).
        功能：
        比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
         */
        int[] arr = {1,2,3,4,5,6};
        int[] brr = {1,2,3,4,5,6};
        equals(arr, brr);

    }

    //分析：
    //1.分析两个数组是否相等
    //2.方法接收两个数组，对其进行遍历
    //3.如果都相等，则输出相同
    //4.这里要注意判定条件，长度和内容都相当

    public static void equals(int[] arr, int[] brr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == brr[i] && arr.length == brr.length) {
                System.out.println("这两个数组相同");
                break;
            } else {
                System.out.println("这两个数组不相同");
                break;
            }
        }
    }
}
