package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘录入两个整数a和b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number number1:");
        int number1 = sc.nextInt();
        System.out.println("Enter number number2:");
        int number2 = sc.nextInt();

        //number1 == 6,number2 == 6,(number1 + number2) % 6 == 0
//        boolean result1 = number1 == 6 || number2 == 6;
//        boolean result2 = (number1 + number2) % 6 ==0;
//        boolean result = result1 || result2;
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);
    }
}
