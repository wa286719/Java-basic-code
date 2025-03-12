package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /*
        给定两个字符串形式表示的非负整数num1和num2，返回他们的乘积，乘积也用字符串形式表示
         */
        //1.生成两个字符串非负整数
        String num1 = "5832";
        String num2 = "523";
        int newnum1 = changeToInt(num1);
        int newnum2 = changeToInt(num2);
        System.out.println(newnum1 * newnum2);

        //因为这不是一个字符，所以不能直接用ASCII码相加
        //将他转变成字符数组，然后把字符数组元素转变为int型
        //定义一个方法用于转变int型

    }

    public static int changeToInt(String str) {
        int newnum = 0;
        for (int i = 0; i < str.length(); i++) {
            newnum += (int) ((str.charAt(i) - '0') * Math.pow(10, str.length() - i - 1));
        }
        return newnum;
    }
}
