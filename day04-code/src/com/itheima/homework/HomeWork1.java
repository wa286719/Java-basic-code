package com.itheima.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
        而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
        为了更省钱，李雷要不要以旧换新？请在控制台输出。
         */

        //分析：分别计算两种情况下新手机的价格
        //定义price1，即为7988 - 1500
        //定义price2，即为7988 * 0.8
        //比较二者大小

        int price1 = 7988 - 1500;
        double price2 = 7988 * 0.8;
        if (price1 < price2) {
            System.out.println("不要以旧换新");
        } else {
            System.out.println("换");
        }
    }
}
