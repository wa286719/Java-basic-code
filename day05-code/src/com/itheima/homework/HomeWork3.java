package com.itheima.homework;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        创建一个长度为6的整数数组。
        请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，
        然后计算出数组中所有元素的和并打印。
         */

        //分析：定义长度为6的数组
        //定义随机数
        //遍历数组，将随机数赋值给每一个数组元素
        //定义sum用于求和
        //遍历数组，sum += arr[i]，另外输出数组元素用于检验

        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组的和是：" + sum);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
