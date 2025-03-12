package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //屏蔽手机号
        //用subString(startIndex,endIndex)方法来截取字符串，原字符串不改变
        //方法返回值返回被截取的字符串
        //在截取过程中，包含startIndex，不包含endIndex
        //即subString(0,2)截取的是索引为0和1的两个
        //也可以直接subString(startIndex)直接从startIndex截取至字符串末尾
        String phoneNumber = "13112349541";
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(3,7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
