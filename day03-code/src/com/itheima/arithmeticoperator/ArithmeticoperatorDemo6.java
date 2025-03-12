//自增运算符
package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo6 {
    public static void main(String[] args) {
        int x= 10;
        //x++是先用后加
        //先将x的值10赋值给y，然后++
        int y = x++;//x=11,y=10
        //++x是先加后用
        //先对x+1，然后再赋值给z
        int z = ++x;//x=12,z=12
        System.out.println("x:" + x);//12
        System.out.println("y:" + y);//10
        System.out.println("z:" + z);//12
    }
}
