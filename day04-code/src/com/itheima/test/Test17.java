package com.itheima.test;

public class Test17 {
    public static void main(String[] args) {
        //珠穆朗玛峰高8844430毫米，有一张纸其厚度为0.1毫米，折叠多少次能达到珠峰高度
        //因为并不知道循环要执行多少次，因此使用while循环

        //定义纸的初始高度
        double paperHeight = 0.1;

        //定义折纸次数
        int count = 0;

        //利用循环来求折纸次数
        while (paperHeight < 8844430) {
            //折叠纸张
            paperHeight *= 2;
            //折叠一次，次数++
            count++;
        }
        System.out.println(count);
    }
}
