package com.itheima.homework;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
        请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
         */

        //分析：
        //1.要将数字的绝对值返回
        //2.判断是否为正数，如果是整数直接返回，
        //3如果是负数则返回相反数
        double number = print(-59.5);
        System.out.println("绝对值是：" + number);
    }
    public static double print(double num) {
        if (num > 0) {
            return num;
        } else {
            return -num;
        }
    }
}
