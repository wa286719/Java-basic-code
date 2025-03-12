package com.itheima.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //键盘输入按键
        Scanner sc =  new Scanner(System.in);
        System.out.println("输入一个按键：");
        int button = sc.nextInt();

        //选择对应的服务
        switch (button) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
