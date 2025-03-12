package com.itheima.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        //短路运算符 && ||,效果和& | 一样

        //短路运算符具有短路效果
        //当左边的表达式能确定最终的结果，那么右边就不会参与运算了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10  已经确定++a不<5，那么后面的++b就不会运算了

        int c = 10;
        int d = 10;
        boolean result1 = ++c < 5 & ++d < 5;
        System.out.println(result1);//false
        System.out.println(c);//11
        System.out.println(d);//还是11
    }
}
