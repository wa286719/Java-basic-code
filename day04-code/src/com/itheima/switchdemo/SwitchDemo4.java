package com.itheima.switchdemo;

/*
    switch新特性
        JDK12
*/

public class SwitchDemo4 {
    public static void main(String[] args) {
        //需求：
        // 1 2 3  一 二  三
        /*int number = 1;
        switch (number){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项");
                break;
        }*/

        //大括号中只有一行代码，可以省略
        /*int number = 10;
        switch (number) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }*/

        int number = 10;
        switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }


    }
}
