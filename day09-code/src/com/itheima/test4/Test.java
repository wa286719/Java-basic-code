package com.itheima.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入：
        //第一套系统
        //nextInt(); 接受整数
        //nextDOuble(); 接收小数
        //next(); 接收字符串
        //遇到空格、制表符（\t）、回车就停止接收，这些符号后面的数据就不会接收了

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num1 = sc.nextInt();//123 123 123
        System.out.println(num1);//只输出123
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();//会直接跳过输入的过程
        System.out.println(num2);//上面的第二个123到这里输出，遇到空格后，空格后面的内容到下一个接收和输出
        System.out.println("请输入第三个整数");
        int num3 = sc.nextInt();
        System.out.println(num3);//只输出123
        */

        //第二套系统
        //nextLine(); 接收字符串
        //只有遇到回车才停止接受

        //混合使用的后果
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();//123 789
        System.out.println(num1);//123
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        System.out.println(line);// 789
        //由于nextInt不接收空格之后的数据，这些数据连同空格到nextLine被接收并输出了
    }
}
