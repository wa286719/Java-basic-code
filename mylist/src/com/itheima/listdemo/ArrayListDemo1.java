package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        //泛型：指集合中存储的数据类型
        //创建一个泛型为string的集合
        ArrayList<String> list = new ArrayList<>();
        //ArrayList类在打印对象时输出的不是地址值而是集合中存储的数据内容
        //所有的数据内容都会用[]包裹起来，如果是空集合就打印[]
        System.out.println(list);
    }
}
