package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        //键盘录入两个数字作为范围
        Scanner sc = new Scanner(System.in);
        System.out.println("输入下限：");
        int lowerLimit = sc.nextInt();
        System.out.println("输入上限：");
        int upperLimit = sc.nextInt();

        //定义count来统计个数
        int count = 0;

        //使用循环获取范围内的数字
        for (int i = lowerLimit; i <= upperLimit; i++) {
            //对数字进行判断，符合则count+1
            if (i % 3 == 0 && i % 5 == 0) {
                count ++;
            }
        }

        //打印count
        System.out.println(count);
    }
}
