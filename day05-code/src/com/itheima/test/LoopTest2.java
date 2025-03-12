package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*
        键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。结果只保留整数部分 ，小数部分将被舍去 。
         */

        //分析：先从键盘录入number
        //怎么样得到平方根？循环从1开始，不断平方，当平方值大于number时停止
        //输出上一个数字
        //定义一个result用于存放平方

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        int result = 0;

        for (int i = 0; i < number; i++) {
            result = i * i;
            if (result > number) {
                System.out.println(i-1);
                //一旦找到，后面的数字就不用只需执行
                break;
            }
        }
    }
}
