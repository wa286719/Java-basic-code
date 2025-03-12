package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，
        淡季（11月到来年4月）头等舱7折，经济舱6.5折。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double originalPrice = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入0或1表示头等舱或经济舱：");
        int type = sc.nextInt();
        double reducedPrice = 0;
        if (month >= 5 && month <= 10) {
            //旺季
            //ctrl + alt + M可以自动抽取方法
            double v0 = 0.9;
            double v1 = 0.85;
            reducedPrice = getPrice(originalPrice, type, v0, v1);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month < 5)) {
            //淡季
            double v0 = 0.7;
            double v1 = 0.65;
            reducedPrice = getPrice(originalPrice, type, v0, v1);
        } else {
            System.out.println("请输入正确月份");
        }
        System.out.println("折扣价格是：" + reducedPrice);
    }

    //分析：
    //1.定义double类型方法ticket，接收三个形参，
    // 其中double类型变量originalPrice表示原价，month表示月份，0表示头等舱，1表示经济舱
    //2.定义double类型变量reducedPrice表示折扣价格，定义double类型变量discount表示折扣
    //3.使用if语句判断，如果月份在5-10，则再判断舱型折扣价格等于原价*相应折扣，else则是另外的折扣

    //这里可以优化代码，在判断舱位输出折扣价格时代码可以放在方法中
    //方法要有四个参数，原价、舱位、头等舱折扣、经济舱折扣
    public static double getPrice(double originalPrice, int type, double v0, double v1) {
        double reducedPrice = 0;
        //旺季
        if (type == 0) {
            //头等舱
            reducedPrice = originalPrice * v0;
        } else if (type == 1) {
            //经济舱
            reducedPrice = originalPrice * v1;
        } else {
            System.out.println("请输入0或1表示舱型");
        }

        return reducedPrice;
    }
}
