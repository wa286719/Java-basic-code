package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*
        请编写程序，由键盘录入一个字符串，
        统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
         */
        String str = "Hello12345World";
        int countLetter = 0;
        int countNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                countLetter++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                countNum++;
            }
        }
        System.out.println("字母有：" + countLetter + "个," + "数字有：" + countNum + "个");
    }
}
