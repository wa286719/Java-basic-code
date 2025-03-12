package com.itheima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串
        String s1 = "abc";
        String s2 = new String("abc");

        //2.用==来比较
        //基本数据类型：比较内容
        //引用数据类型：比较地址值
        System.out.println(s1 == s2);

        //3.用equals来比较，严格大小写
        //equals返回一个Boolean类型的值
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //4.用equalsIgnoreCase比较，模糊大小写
        boolean result2 =  s1.equalsIgnoreCase(s2);
        System.out.println(result2);

    }
}
