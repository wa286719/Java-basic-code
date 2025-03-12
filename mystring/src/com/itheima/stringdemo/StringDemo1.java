package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.直接赋值创建字符串对象
        String s1 = "abc";

        //2.通过new创建字符串对象
        //空参构造，创建一个空的字符串
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //传递一个字符数组，根据字符数组的内容创建新的字符串
        //字符串的内容无法改变，所以可以通过改变字符数组对应索引的值
        //来改变数组的值
        //abc-->{'a','b','c'}-->{'Q','b','c'}-->Qbc
        char[] chs = {'a','b','c'};
        String s3 = new String(chs);
        System.out.println(s3);

        //传递一个字节数组，根据字节数组的内容创建新的字符串
        //这里就根据数组内容匹配ASCII码输出
        //在网络中传输的数据都是字节信息
        byte[] bytes = {97,98,99};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
