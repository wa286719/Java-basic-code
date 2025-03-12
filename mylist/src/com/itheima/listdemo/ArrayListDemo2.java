package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        /*
        ArrayList<E> list = new ArrayList<>()
        | public boolean add(E e)      | 将指定的元素追加到此集合的末尾         |
        | ------------------------------------- | -------------------------------------- |
        | public boolean remove(E e)   | 删除指定元素,返回值表示是否删除成功    |
        | public E  remove(int   index)         | 删除指定索引处的元素，返回被删除的元素 |
        | public E   set(int index,E   element) | 修改指定索引处的元素，返回被修改的元素 |
        | public E   get(int   index)           | 返回指定索引处的元素                   |
        | public int   size()                   | 返回集合中的元素的个数                 |
         */

        ArrayList<String> list = new ArrayList<>();

        //1.增加元素
        //add方法始终返回ture，所以没有必要用变量接收返回值，直接调用即可
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //2.删除元素
//        boolean result = list.remove("aaa");
//        System.out.println(result);
        //删除指定索引处的元素，返回被删除的元素
//        String result = list.remove(2);
//        System.out.println(result);

        //3.修改元素
        //修改指定索引的元素，并返回被修改的元素
//        String result = list.set(0,"ddd");
//        System.out.println(result);

        //4.查看元素
        //返回指定索引的元素
//        String result = list.get(3);
//        System.out.println(result);
        
        //遍历集合 list.size()
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
