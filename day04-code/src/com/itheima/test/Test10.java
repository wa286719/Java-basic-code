package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出星期数：");
        int week = sc.nextInt();

        //选择星期数进行匹配
/*        switch (week) {
            case 1 -> System.out.println("工作日");
            case 2 -> System.out.println("工作日");
            case 3 -> System.out.println("工作日");
            case 4 -> System.out.println("工作日");
            case 5 -> System.out.println("工作日");
            case 6 -> System.out.println("休息日");
            case 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }*/

        //使用case穿透
/*        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
        }*/

        switch (week) {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }
}
