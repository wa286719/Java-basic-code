package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数 x ，判断该整数是否为一个质数。

        //分析：先键盘录入一个number
        //同样使用for循环，i从1开始到number，得到所有的数
        //然后用number去对i取余，如果结果为0则表示i能被number整除
        //定义一个count来计数，如果有超过两个i能被number整除
        //说明number不是质数

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();
        int count = 0;

/*        //标记思想，定义一个变量表示标记
        //标记number是否为质数
        //true：是质数
        //false：不是质数
        boolean flag = true;
        //从2开始到number-1结束，只要有一个i能被number整除就说明不是质数
        for (int i = 2;i < number ;i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("该数是质数");
        } else {
            System.out.println("该数不是质数");
        }*/


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count > 2) {
            System.out.println("该数不是质数");
        } else {
            System.out.println("该数是质数");
        }
    }
}
