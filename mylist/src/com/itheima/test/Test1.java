package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //创建集合，存入字符串然后遍历
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //遍历集合，用[aaa, bbb, cccc, ddd]形式输出
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
