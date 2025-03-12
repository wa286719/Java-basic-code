package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        95~100 自行车一辆
        90~94   游乐场玩一天
        80 ~ 89 变形金刚一个
        80 以下  胖揍一顿
         */

        //键盘录入小明的分数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分数");
        int score = sc.nextInt();

        //对异常数据进行判断校验
        if (score >= 0 && score <= 100) {
            //判断分数并输出奖励
            if (score >= 95) {
                System.out.println("送你一辆自行车");
            } else if (score >= 90) {
                System.out.println("送你去游乐场");
            } else if (score >= 80) {
                System.out.println("送你一个变形金刚");
            } else {
                System.out.println("你完了，揍你一顿");
            }
        } else {
            System.out.println("输入的成绩不合法");
        }

    }
}
