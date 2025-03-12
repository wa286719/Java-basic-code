package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：
        把一个数组中的元素复制到另一个新数组中去。
         */

        //分析：
        //1.先定义数组arr并存入数据，再定义长度为arr.length的数组brr
        //2.遍历arr，将arr[i]赋值给brr[i]
        //3.打印arr和brr

        int[] arr = {1,2,3,4,5,6,8,9,};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        System.out.print("arr:" + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("brr:" + " ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + "  ");
        }
    }
}
