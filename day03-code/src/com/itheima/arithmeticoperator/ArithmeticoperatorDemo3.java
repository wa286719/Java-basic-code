package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        //现在要强转的是b1+b2，所以要加括号
        byte result = (byte) (b1 + b2);
        System.out.println(result);//结果就发生错误，因为强转的数据过大
    }
}
