package com.itheima.test.test2;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("老马");
        gf1.setAge(18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();

    }
}
