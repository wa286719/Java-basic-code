package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int temp = height1 > height2 ? height1 : height2;
        int max = height3 > temp ? height3 : temp;
        //ctrl + alt + L 自动格式化对齐代码
        System.out.println(max);
    }
}
