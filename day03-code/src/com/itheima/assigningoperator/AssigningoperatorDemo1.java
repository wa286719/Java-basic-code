package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        //+=
        //规则：将左边和右边进行相加，然后再将结果赋值给左边
        int a = 10;
        int b = 20;
        //把a+b，再把结果赋值给a
        a += b;
        //等同于：a = (int) (a + b)
        System.out.println(a);//30
        System.out.println(b);//20


        //细节
        //+=， -=， *=， /=， %=底层都隐藏了一个强制类型转换
        short s = 1;
        s += 1;
        //等同于：s = (short) (s + 1)
        System.out.println(s);//2
    }
}
