package com.itheima.test;

import java.util.Random;

public class Test4Case2 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。
         */

        //注意：数字怎么添加？
        //和test3一样的思路，将字母放在前四位，随机数字拼接在最后一位
        //然后让数字和随机的字母交换位置
        //思路：利用循环将所有的大小写字母加入到数组中
        //利用ASCII码表
        Random r = new Random();
        int num2 = r.nextInt(10);
        int num3 = r.nextInt(5);
        char[] letter = new char[52];
        //将大小写字母添加到数组中
        for (int i = 0; i < 26; i++) {
            letter[i] = (char) ('A' + i);
        }
        for (int i = 26; i < letter.length; i++) {
            letter[i] = (char) ('a' + i - 26);
        }
        char[] arr = new char[5];
        arr[num3] = Integer.toString(num3).charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (i == num3) {
                continue;
            }
            int num1 = r.nextInt(52);
            arr[i] = letter[num1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
