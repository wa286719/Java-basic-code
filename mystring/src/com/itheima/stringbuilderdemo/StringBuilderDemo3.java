package com.itheima.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //链式编程
        //调用方法时，不需要用变量去接受他的返回值，而是继续调用方法
        //把方法的调用写在一行
        StringBuilder sb = new StringBuilder();
        int length = sb.append("Hello World").append(89).append(true).substring(1).length();
        System.out.println(length);
    }
}
