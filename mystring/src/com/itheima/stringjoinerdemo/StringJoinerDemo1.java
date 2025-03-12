package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //StringJoiner 方法可以用于拼接字符串
        //它也是一个容器
        //new时必须有参构造，第一个参数是间隔符号
        //第二个是开头符号，第三个是结束符号
        //也可以只有间隔符号构造
        StringJoiner sj = new StringJoiner(",","[","]");
        //add方法只能拼接String类型字符串
        sj.add("1").add("2").add("3").add("4").add("5");
        int length = sj.length();
        System.out.println(sj.toString());
    }
}
