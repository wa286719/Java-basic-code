package com.itheima.test;

public class Test14 {
    public static void main(String[] args) {
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0

        //注意
        //1.求和的变量不能定义在循环的里面，因为变量只在所属的大括号有效
        //2.如果将变量定义在循环的里面，那么当前变量只能再本次循环中有效
        //当本次循环结束之后，变量就会从循环中消失
        //第二次循环开始的时候会重新定义一个新的变量
        //结论：以后写累加求和的变量，要将变量定义在循环外面
        int sum = 0;

        //循环累加
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        //输出
        System.out.println(sum);
    }
}
