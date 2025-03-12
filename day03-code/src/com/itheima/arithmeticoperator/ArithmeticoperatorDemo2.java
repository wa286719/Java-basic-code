package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    //结论：
    //1.整数参与计算只能得到整数
    //2.小鼠参与计算，结果可能不精确
    public static void main(String[] args) {
        //除法
        System.out.println(10 / 2);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);//3.33333333333335

        //取模，取余。实际上也是做除法运算，只不过得到的是余数
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1

        //应用场景
        //1.用取模运算来判断，A是否可以被B整除
        //A % B
        //2.可以判断A是否为偶数
        //A % 2 如果结果为0，那么证明A是一个偶数，结果为1，则A是奇数
        //3.斗地主发牌
        //三个玩家
        //拿序号对3取余，结果为1，就发给第一个玩家
        //结果为2就发给第二个玩家
        //结果为0就发给第三个玩家

    }
}
