package com.itheima.homework;

public class HomeWork8 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
        功能：
        将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
         */
        int[] arr = {89,55,74,86,1,2,3};
        fill(arr, 2, 5,77);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    //分析：
    //1.定义int[]类型方法fill，有四个形参
    //2.遍历数组arr，从fromIndex开始到toIndex结束，将arr[i]的值全改为value
    //3.返回数组arr

    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
