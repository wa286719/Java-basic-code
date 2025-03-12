package com.itheima.homework;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        /*
        模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
    	键盘录入三个整数,其中前两个整数代表参加运算的数据，
    	第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
    		请输入第一个整数: 30
    		请输入第二个整数: 40
    		请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
    		控制台输出:30+40=70
         */

        //分析：键盘录入三个数，定义num1，num2，num3
        //num1和2表示参与运算的数，num3表示运算方式
        //使用switch语句，4个case

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int num1 = sc.nextInt();
        System.out.println("请输入数字2：");
        int num2 = sc.nextInt();
        System.out.println("请输入数字3：");
        int num3 = sc.nextInt();
        double result;

        switch (num3) {
            case 1 :
                result = num1 + num2;
                System.out.println(result);
                break;
            case 2 :
                result = num1 - num2;
                System.out.println(result);
                break;
            case 3 :
                result = num1 * num2;
                System.out.println(result);
                break;
            case 4 :
                //注意这里，如果只用num1 / num2的话是整数除法，结果还是int型，会丢失精度
                //可以在前面*1.0或用强制类型转换
                result = 1.0 * num1 / num2;
                System.out.println(result);
                break;
            default :
                System.out.println("请输入正确数字3");
                break;
        }
    }
}
