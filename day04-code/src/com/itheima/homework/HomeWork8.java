package com.itheima.homework;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        /*
        需求：键盘录入两个数字，表示一个范围。
               统计这个范围中。
    	    既能被3整除，又能被5整除数字有多少个？
         */

        //分析：使用三元运算符判断二者大小关系
        //定义max、min变量存放最大值和最小值
        //使用for循环完成累加
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字1：");
        int num1 = sc.nextInt();
        System.out.println("请输入数字二：");
        int num2 = sc.nextInt();
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        int count = 0;
        //用for循环得到min到max范围内的所有数
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);

        //分析：键盘录入两个数字num1,num2
        //定义count用于统计符合条件数字的个数
        //先判断num1和num2的大小
        //假如num1<num2，使用while循环，当num1<=num2时
        //用if判断是否有数字能既被三整除又被五整除,
        //num1自增一次


/*        int count = 0;
        if (num1 < num2) {
            while (num1 <= num2) {
                if (num1 % 3 == 0 && num1 % 5 == 0) {
                    count++;
                }
                num1++;
            }
            System.out.println("符合条件的数字有" + count + "个");
        } else if (num1 > num2) {
            while (num2 <= num1) {
                if (num2 % 3 == 0 && num2 % 5 == 0) {
                    count++;
                }
                num2++;
            }
            System.out.println("符合条件的数字有" + count + "个");
        } else {
            if (num1 % 3 == 0 && num2 % 5 == 0) {
                count = 1;
            }
            System.out.println("符合条件的数字有" + count + "个");
        }*/
    }
}
