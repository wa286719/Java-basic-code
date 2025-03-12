package com.itheima.methoddemo;

public class Test9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);//100
        number = change(number);
        //传递基本数据类型时，传递的是真实的数据，形参的改变不影响实际参数的值
        System.out.println("调用change方法后：" + number);//300
    }

    public static int change(int number) {
        number += 200;
        return number;
    }
}
