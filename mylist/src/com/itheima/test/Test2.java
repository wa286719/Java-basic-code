package com.itheima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //如果要添加基本数据类型则泛型要写其对应的包装类
        //int -> Integer  char -> Character
        //其余基本数据类型首字母大写即可

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
