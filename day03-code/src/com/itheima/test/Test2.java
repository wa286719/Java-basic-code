package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的时髦度：");
        int boyFashion = sc.nextInt();
        System.out.println("请输入相亲对象的时髦度：");
        int girlFashion = sc.nextInt();

        boolean result = boyFashion > girlFashion;

        System.out.println(result);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入您的时髦度: ");
//        int boy = sc.nextInt();
//        if (boy >= 0 && boy <= 10) {
//            System.out.println("请输入您对象的时髦度：");
//            int girl = sc.nextInt();
//            if (girl >= 0 && girl <= 10) {
//                if (boy > girl) {
//                    System.out.println(true);
//                }
//                else {
//                    System.out.println(false);
//                }
//            }
//            else {
//                System.out.println("请输入0~10之间的整数");
//            }
//        }
//        else {
//            System.out.println("请输入0~10之间的整数");
//        }
    }
}
