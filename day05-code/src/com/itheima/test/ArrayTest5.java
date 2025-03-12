package com.itheima.test;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        /*
        需求：生成10个1~100之间的随机数存入数组。
        1）求出所有数据的和
        2）求所有数据的平均数
        3）统计有多少个数据比平均值小
         */

        //分析：首先导包import java.util.Ramdom;
        //定义随机数 Random r = new Random()
        //定义数组，定义sum用于求和，定义double类型average用于求平均数，定义count用于计数
        //遍历数组，将随机数存入数组
        //要1~100范围的随机数，则定义0~99然后+1
        //使用sum+=数组值求和，
        //然后用sum/数组长度求平均数
        //再次遍历数组，用if语句判断元素是否大于平均数，符合条件count++

        Random r = new Random();
        int[] arr = new int[10];
        int sum = 0;
        double average = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            sum += arr[i];
        }

        //遍历数组并输出，看看答案对不对
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        average = 1.0 * sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        System.out.println("和是：" + sum);
        System.out.println("平均数是：" + average);
        System.out.println("个数是：" + count);

    }
}
