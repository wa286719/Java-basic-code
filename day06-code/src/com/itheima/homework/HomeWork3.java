package com.itheima.homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        在主方法中通过键盘录入三个整数。定义一个方法，
        方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
        请输入第一个整数：10
        请输入第二个整数：30
        请输入第三个整数：20
        从大到小的顺序是： 30 20 10
         */

        //分析：
        //1.要将键盘输入的三个数排序
        //2.需要键盘输入三个数字
        //3.没有返回值

        //主方法中定义三个键盘输入值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num3 = sc.nextInt();
        //调用print方法
        print(num1, num2, num3);
    }

    //1.定义int[]类型print方法中定义三个int型形参
    //2.对这三个元素排序
    //3.打印
    public static void print(int num1, int num2, int num3) {
        //定义临时变量temp用于交换顺序
        int temp = 0;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("从大到小的顺序是：" + num3 + "  " + num2 + "  " + num1);
    }

}
