package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求 :
        在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
         */

        //分析：
        //1.先定义打分方法，获取分数数组
        //2.分别找出六个数中的最大值和最小值，分别赋值给max和min
        //3.再将六个数求和减去max和min最后除以4
        Random r = new Random();
        //获取分数
        int[] score = getScore();
        //获取最高分
        int max = getMax(score);
        //获取最低分
        int min = getMin(score);
        int sum = 0;
        //获取总分
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        //获取平均分
        int avg = (sum - max - min) / 4;
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println("平均分是：" + avg);
    }

    //定义getMax用于获得最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //定义getMin用于获取最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //定义getScore用于获取键盘录入分数
    //定义一个数组用于存储分数
    public static int[] getScore() {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入分数：");
            int sco = sc.nextInt();
            if (sco >= 0 && sco <= 100) {
                score[i] = sco;
            } else {
                System.out.println("请输入正确分数");
            }
        }
        return score;
    }
}
