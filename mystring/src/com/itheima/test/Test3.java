package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        //如果要修改字符串内容
        //1.substring
        //2.字符数组
        //这里使用字符数组，从0索引开始跟随即索引交换位置

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        Random r = new Random(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }
        String str1 = new String(arr);
        System.out.println(str1);


    }
}
