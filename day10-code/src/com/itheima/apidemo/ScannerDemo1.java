package com.itheima.apidemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        //2.接收数据
        double reslut = sc.nextDouble();
        System.out.println(reslut);
    }
}
