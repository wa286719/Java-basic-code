package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //输入老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入老虎1的体重：");
        int tiger1 = sc.nextInt();
        System.out.println("请输入老虎2的体重：");
        int tiger2 = sc.nextInt();

        //比较
        //true false
        boolean result1 = tiger1 == tiger2;
        System.out.println(result1);
        //相同 不同
        String result2 = tiger1 == tiger2 ? "相同" : "不同";
        System.out.println(result2);
    }
}
