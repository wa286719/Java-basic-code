package com.itheima.homework;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。
        计算并输出学生的平均成绩。
         */

        //分析：定义数组并存入数据
        //定义变量sum用于求和，double型avg用于求平均数
        //遍历数组，先求和，然后求平均数

        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = 1.0 * sum / arr.length;
        System.out.println("平均成绩是：" + avg);
    }
}
