package com.itheima.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //添加字符
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        System.out.println(sb);

        //将StringBuilder变回String
        String str = sb.toString();
        System.out.println(str);

    }
}
