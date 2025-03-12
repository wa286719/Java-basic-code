/* 需求：

键盘录入一个三位数，求这个三位数每一位的数字和。

举例：键盘录入123。那么每一位数字相加为：1 + 2 + 3，和为：7。 */

package com.itheima.homework;

import java.util.Scanner;

public class Homework5{
    public static void main(String args[]){
        //定义输入
        Scanner sc = new Scanner(System.in);

        //输入数字
        System.out.println("请输入三位数字：");
        int number = sc.nextInt();

        //分别计算个位、十位和百位
        int gewei = number % 10;
        int shiwei = (number / 10) % 10;
        int baiwei = (number / 100) % 10;

        //计算个位、十位和百位的和并输出
        int sum = gewei + shiwei + baiwei;
        System.out.println("和为：" + sum);
    }
}