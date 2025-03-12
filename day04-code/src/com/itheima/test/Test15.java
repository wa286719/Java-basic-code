package com.itheima.test;

public class Test15 {
    public static void main(String[] args) {
        //求1-100之间的偶数和

        //快速开始循环 100.fori

        //定义和
        int sum = 0;

        //获取1-100之间的数
        for (int i = 1; i <= 100; i++) {
            //判断是否为偶数
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
