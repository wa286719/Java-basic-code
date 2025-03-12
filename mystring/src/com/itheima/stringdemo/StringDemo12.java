package com.itheima.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //replace方法，talk.replace("TMD","***")
        String talk = "下次不要再玩了，TMD";
        //replace方法的返回值才是替换过后的内容，需要定义一个变量接收返回值
        String result = talk.replace("TMD","***");
        System.out.println(result);
    }
}
