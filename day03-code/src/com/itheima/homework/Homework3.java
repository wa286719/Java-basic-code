/* 某小伙想定一份外卖，商家的优惠方式如下：
鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
那么这个小伙要点这三样东西，最少要花多少钱？ */

package com.itheima.homework;

public class Homework3 {
    public static void main(String[] args) {
        //定义鱼香肉丝、油炸花生米和米饭的价格
        int YuxiangShreddedPork = 24;
        int FriedPeanuts = 8;
        int rice = 3;

        //计算使用优惠的价格
        double price1 = YuxiangShreddedPork + FriedPeanuts + rice>30 ? (YuxiangShreddedPork + FriedPeanuts + rice) * 0.8 : YuxiangShreddedPork + FriedPeanuts + rice;

        //计算折扣价格
        double price2 = 16 + FriedPeanuts + rice;

        //比较二者谁更划算并输出
        System.out.println(price1 > price2 ? price2 : price1);
    }
}
