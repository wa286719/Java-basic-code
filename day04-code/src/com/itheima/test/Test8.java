package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        //自动驾驶练习
        //定义三个变量表示灯的状态
        //true 亮  false 灭
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        //判断
        if(isLightGreen) {
            System.out.println("gogogo");
        } else if (isLightYellow) {
            System.out.println("slow");
        } else if (isLightRed) {
            System.out.println("stop");
        }
    }
}
