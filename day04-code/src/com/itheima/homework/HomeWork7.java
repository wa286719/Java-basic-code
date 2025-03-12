package com.itheima.homework;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
         */

        //分析：键盘录入两个数字num1和num2
        //先判断num1和num2的大小
        //选择while循环，假如num1<num2，则当num1<num2时
        //定义result存放累加的结果，循环每执行一次，num1自增一次

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int num1 = sc.nextInt();
        System.out.println("请输入数字2：");
        int num2 = sc.nextInt();
        //定义result用于存放累加结果
        int result = 0;

        //可以用三元运算符
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        //累加求和
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);


/*        if (num1 < num2) {
            while (num1 <= num2) {
                result += num1;
                num1++;
            }
        } else if (num2 < num1) {
            while (num2 <= num1) {
                result += num2;
                num2++;
            }
        } else {
            result = num1;
        }
        System.out.println(result);*/
    }
}
