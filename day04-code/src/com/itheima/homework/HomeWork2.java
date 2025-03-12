package com.itheima.homework;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
         */



        //分析：键盘录入三个数，使用if语句来比较大小

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1");
        int number1 = sc.nextInt();
        System.out.println("请输入数字2");
        int number2 = sc.nextInt();
        System.out.println("请输入数字3");
        int number3 = sc.nextInt();

        //使用三元运算符
        System.out.println(number1 < number2 ? number1 < number3 ? number1 : number3 : number2 < number3 ? number2 : number3);




/*        //number1比number2小，则比较number1和num3大小
        if (number1 < number2) {
            //number1比number3小，则number1最小
            if (number1 < number3) {
                System.out.println("最小值为：" + number1);
                //number1比number3大，则number3最小
            } else {
                System.out.println("最小值为：" + number3);
            }
            //num1比num2大，则比较num2和num3大小
        } else {
            //num2比num3小，则num2最小
            if (number2 < number3) {
                System.out.println("最小值为" + number2);
                //num3比num2小，则num3最小
            } else {
                System.out.println("最小值为：" + number3);
            }
        }*/
    }
}
