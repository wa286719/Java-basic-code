package com.itheima.test;

import java.util.Random;

public class Test4Case1 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。
         */

        //注意：如何将int型数字转变为char类型？
        //使用arr[num3] = Integer.toString(num3).charAt(0)方法
        //思路：利用循环将所有的大小写字母加入到数组中
        //利用ASCII码表
        Random r = new Random();
        //num2用于生成0-9的随机数
        int num2 = r.nextInt(10);
        //num3用于生成0-3随机数交换位置
        int num3 = r.nextInt(4);
        char[] letter = new char[52];
        //将大小写字母添加到数组中
        for (int i = 0; i < 26; i++) {
            letter[i] = (char) ('A' + i);
        }
        for (int i = 26; i < letter.length; i++) {
            letter[i] = (char) ('a' + i - 26);
        }
        //先定义一个长度为4的数组用于存放大小写字母
        char[] arr = new char[4];
        //将字母拼接在数组前四位
        for (int i = 0; i < arr.length; i++) {
            int num1 = r.nextInt(52);
            arr[i] = letter[num1];
        }
        //将数字拼接在最后一位
        //要怎么拼接呢？字符没有办法直接+数字，可以将字符数组转变为字符串
        String str = new String(arr);
        str += num2;
        //再将字符串转变为字符数组
        arr = str.toCharArray();
        //遍历数组，交换位置
        char temp = arr[num3];
        arr[num3] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
