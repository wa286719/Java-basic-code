package com.itheima.homework;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
        再通过键盘录入一个整数数字。
        要求：把数字放入数组序列中，生成一个新的数组，
        并且数组的元素依旧是从小到大排列的。执行效果如下：
        请输入一个整数数字：
        50
        生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
         */

        //分析：先定义数组1并存入数据
        //键盘输入一个数字定义为num
        //定义一个数组2长度为11，先遍历数组2，将数组1的值赋给数组2
        //将num存入数组2末尾
        //定义中间变量temp
        //从末尾遍历数组2，用if语句判断num和数组元素的大小关系，
        //如果num<数组元素，则二者交换位置
        //一旦num大于数组元素，break

        //先定义数组1并存入数据
        int[] arr1 = {12,14,23,45,66,68,70,77,90,91};
        //键盘输入一个数字定义为num
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        ////定义一个数组2长度为11，先遍历数组2，将数组1的值赋给数组2
        int[] arr2 = new int[arr1.length + 1];
        for (int i = 0; i < arr2.length - 1; i++) {
            arr2[i] = arr1[i];
        }
        //将num存入数组2末尾
        arr2[arr2.length - 1] = num;
        //定义中间变量temp
        int temp;
        //从末尾遍历数组2，用if语句判断num和数组元素的大小关系，
        //如果num<数组元素，则二者交换位置
        //一旦num大于数组元素，break
        for (int i = arr2.length - 2; i >= 0; i--) {
            if (num < arr2[i]) {
                temp = arr2[i];
                arr2[i] = num;
                arr2[i + 1] = temp;
            } else {
                break;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println("  ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
    }
}
