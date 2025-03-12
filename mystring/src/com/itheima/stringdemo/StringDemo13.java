package com.itheima.stringdemo;

public class StringDemo13 {
    public static void main(String[] args) {
        //如果要替换的敏感词很多怎么办？
        //定义一个敏感词库，用数组存放敏感词，然后遍历数组用replace循环替换
        //1.输入内容
        String talk = "CNM,玩这么菜不要玩了,TMD";

        //2.定义敏感词库
        String[] arr = {"CNM","TMD","MLGB"};

        //3.遍历数组，使用replace循环替换最后将结果输出
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
