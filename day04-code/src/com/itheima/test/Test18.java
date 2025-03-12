package com.itheima.test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        /*
        输入一个整数x，如果x是回文数则打印true，否则打印false
        回文数是指正序（从左到右）和倒序（从右到左）读都是一样的整数
        例如121是回文数，123不是
         */

        //键盘录入一个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int number = sc.nextInt();
        //为何要定义temp？
        //如果不定义，while循环结束之后number的值最终变为0
        int temp = number;

/*        //定义一个数字
        int number = 121;
        int temp = number;*/

        //定义最终结果用来拼接个位
        int result = 0;

        //利用循环将其按照个十百千万拆解，不断对10取余
        //判断条件是不为0，即>0
        while (temp > 0) {
            //从右往左获取每一位数字
            int ge = temp % 10;
            //修改number记录的值
            temp /= 10;
            //拼接最终结果
            //用result*10再加上新的个位
            //保证当前获取到的数字拼接到最右边
            result = result * 10 + ge;
        }
        if (number == result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
