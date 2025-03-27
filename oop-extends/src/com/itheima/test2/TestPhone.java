package com.itheima.test2;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone("小米",3999);
        Phone.size = 6;
        phone.call();
        phone.sendMessage();
        phone.playGame();
        System.out.println(phone.size);
    }
}
