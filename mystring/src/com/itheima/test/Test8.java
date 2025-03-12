package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /*
        请定义一个方法用于判断一个字符串是否是对称的字符串，
        并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
         */
        String str = "上海自风来自海上";
        String newstr = checkReverse(str);
        if (newstr.equals(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static String checkReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
