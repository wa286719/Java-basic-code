package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        //输出语句soutf只能输出，不能换行
        //soutf有两部分参数，
        //第一部分参数：要输出的内容%s（占位）
        //第二部分参数：填充%s占位的数据
        System.out.printf("你好啊%s","张三");
        System.out.println();
        System.out.printf("%s你好啊%s","张三","李四");
    }
}
