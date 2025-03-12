package com.itheima.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //StringBuilder方法
        //创造一个容器，容器内的数据是可以修改的
        StringBuilder sb = new StringBuilder("Hello World");
        //StringBuilder是可以直接修改容器的，
        //不像String会有返回值，需要接收才能得到修改后的内容
        //StringBuilder是直接在容器内修改

        //sb.append用于向容器中拼接数据
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //sb.reverse用于反转容器内的数据
        sb.reverse();

        //sb.length()用于返回容器内数据长度
        int length = sb.length();
        System.out.println(length);
        System.out.println(sb);
    }
}
