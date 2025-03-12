package com.itheima.homework;

public class Homework1 {
    public static void main(String[] args) {
        double fatherHeight = 177;//定义父亲身高
        double motherHeight = 165;//定义母亲身高
        double boyHeight = (fatherHeight + motherHeight) * 1.08 / 2;//计算男孩身高
        double girlHeight = (motherHeight + fatherHeight * 0.923) / 2;//计算女孩身高
        System.out.println("男孩身高是：" + boyHeight + "cm");//输出
        System.out.println("女孩身高是：" + girlHeight + "cm");
    }
}
