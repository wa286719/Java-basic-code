package com.itheima.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        /*
        1，main方法中定义一个集合，存入三个用户对象。
        用户属性为：id，username，password
        2，要求：定义一个方法，根据id查找对应的学生信息。
        如果存在，返回索引
        如果不存在，返回-1
         */
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User(001,"zhangsan","123");
        User user2 = new User(003,"lisi","123");
        User user3 = new User(003,"wangwu","123");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println(findIndex(list,003));
    }

    public static int findIndex(ArrayList<User> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
