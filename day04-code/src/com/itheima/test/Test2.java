package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //定义三个变量表示灯的状态
        //true 亮  false 灭
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        //判断
        if(isLightGreen) {
            System.out.println("gogogo");
        }
        if(isLightYellow) {
            System.out.println("slow");
        }
        if(isLightRed) {
            System.out.println("stop");
        }
    }
}
