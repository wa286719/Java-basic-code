package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求：
        某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        规则如下：
        先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
        举例：
                1	9	8	3
        +5		6   14  13  8
        %10		6   4   3   8
        反转	   8   3   4   6
        加密后的结果就是：8346
         */

        //分析：
        //1.键盘输入一个数字num
        //2.定义变量length，使用循环让num/10，判断num的位数，令length++
        //3.定义数组arr，长度为length，
        //4.遍历arr，将num的每一位存入arr中
        //5.定义加数方法和取余方法
        //6.在数组中不需要交换位置，因为再遍历数组对num取模存入时已经翻转
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原密码：");
        int num = sc.nextInt();
        int num1 = num;
        int num2 = num;
        int length = 0;
        //使用循环让num/10，判断num的位数，令length++
        while(num1 > 0) {
            num1 /= 10;
            length ++;
        }
        //定义数组arr，长度为length
        int[] arr = new int[length];
        //遍历arr，将num的每一位存入arr中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num2 % 10;
            num2 /= 10;
        }
        //遍历arr，令每一个元素+5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = plus(arr[i], 5);
        }
        //遍历arr，令每一个元素%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rem(arr[i], 10);
        }
        //输出arr
        System.out.print("新密码为：" + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    //定义加方法
    //augend 被加数 addend 加数
    public static int plus(int augend, int addend) {
        return augend + addend;
    }
    //定义取余方法
    public static int rem(int num1, int num2) {
        return num1 % num2;
    }
}
