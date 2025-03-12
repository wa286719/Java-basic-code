/* 数字6是一个真正伟大的数字，键盘录入两个整数。

如果其中一个为6，最终结果输出true。

如果它们的和为6的倍数。最终结果输出true。

其他情况都是false。 */

package com.itheima.homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String args[]){
        //定义输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int number1 = sc.nextInt();
        System.out.println("请输入数字2：");
        int number2 = sc.nextInt();

        //分别比较输入是否有6和其和是否为6的倍数
        boolean result1 = number1 == 6 || number2 == 6 ? true : false;
        boolean result2 = (number1 + number2) % 6 == 0 ? true : false;

        //整合结果并输出
        boolean result =result1 || result2;
        System.out.println(result);
    }
}