package com.itheima.homework;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个方法fill(int[] arr,int value)
        功能：
        将数组arr中的所有元素的值改为value
         */

        int[] arr = {89,55,74,86,1,2,3};
        fill(arr, 9);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    //分析：
    //1.定义int[]类型的方法fill，在方法fill中有两个形参
    //2.遍历数组arr，将所有元素的值改为value
    //3.返回arr
    //因为这里引用数据类型传递地址值，因此在方法中直接改变了数组arr，不用返回
    public static void fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }

}
