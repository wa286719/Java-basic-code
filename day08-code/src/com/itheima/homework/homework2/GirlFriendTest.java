package com.itheima.homework.homework2;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*
        请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法
         */

        GirlFriend girlfriend = new GirlFriend("老马",166,120);
        girlfriend.show();
        girlfriend.wash();
        girlfriend.cook();
    }
}
