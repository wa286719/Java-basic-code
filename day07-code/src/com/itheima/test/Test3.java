package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
        需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字
         */
        Random r = new Random();
        //1.将大小写字母都放入数组中
        //怎么表示所有的大小写字母？
        //使用ASCII码表
        char[] chs = new char[52];
        //遍历chs数组，首先将大写字母存入，A，从65开始
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                chs[i] = (char) ('A' + i);
            } else {
                chs[i] = (char) ('a' + i - 26);
            }
        }
        //随机抽取四个元素出来
        //将其拼接到String类型变量result中，直接加就可以
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result += chs[randomIndex];
        }
        //随机生成0~9的数字
        int randomNum = r.nextInt(10);
        result += randomNum;
        System.out.println(result);

        //将数字强转成char类型得到的不是字符数字，而是对应的符号
        //错误的：code[4] = (char) (r.nextInt(10));


    }

    //分析：
    //1.定义void型方法code，不需要参数
    //2.怎么生成验证码？定义String型数组arr，将26个英文字母的大小写存入
    //3.定义随机数，生成四个随机数，用于抽取数组元素，范围为数组长度
    //4.再生成一个范围0~9的随机数，最后将其拼接


    /*public static void code() {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random r = new Random();
        int num1 = r.nextInt(arr.length);
        int num2 = r.nextInt(arr.length);
        int num3 = r.nextInt(arr.length);
        int num4 = r.nextInt(arr.length);
        int num5 = r.nextInt(10);
        System.out.println(arr[num1] + arr[num2] + arr[num3] + arr[num4] + num5);
    }*/
}
