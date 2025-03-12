package com.itheima.homework;

public class HomeWork9 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个方法copyOf(int[] arr, int newLength)
        功能：
        将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
         */

        int[] arr = {89,55,74,86,1,2,3};
        arr = copyOf(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    //分析：
    //1.定义int[]类型的方法，方法有两个形参
    //2.定义新数组brr，遍历数组arr，从0开始到newLength结束
    //3.将这么多元素赋值给新数组brr
    //4.返回brr
    public static int[] copyOf(int[] arr, int newLength) {
        int[] brr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            brr[i] = arr[i];
        }
        return brr;
    }
}
