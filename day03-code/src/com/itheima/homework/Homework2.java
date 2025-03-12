/* 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
那么红茶和绿茶现在的钱一样多，请问对么？ */

package com.itheima.homework;

public class Homework2 {
    public static void main(String[] args) {
        //定义红茶之前的钱并计算几天后的钱
        int redMoneyBefore = 21;
        int redMoneyAfter = redMoneyBefore * 2 + 3;

        //定义绿茶之前的钱并计算几天后的钱
        int greenMoneyBefore = 24;
        int greenMoneyAfter = greenMoneyBefore * 2;

        //比较二人几天后的钱是否相等
        boolean result = redMoneyAfter == greenMoneyAfter;
        System.out.println(result);
    }
}
