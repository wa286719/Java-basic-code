package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*
        设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
         */

              /*  //先打印数据，再进行换行
        System.out.println("aaa");
        //只打印不换行
        System.out.print("bbb");
        System.out.print("ddd");
        //不打印任何内容，只换行
        System.out.println();
        System.out.print("cc");*/

        //分析：
        //1.先定义一个有参数的方法getTraversal，形参为数组，不需要返回值
        //2.在方法中遍历数组
        //3.在main方法中调用遍历数组方法
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) {
            System.out.print(arr[i] + "]");
        } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
