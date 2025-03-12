package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //目标：要能区分什么时候用带返回值的方法
        //需求：定义方法，比较两个长方形的面积

        //分析：要把重复或具有独立功能的代码抽取到方法中
        //因此可以定义两个方法，一个用来求面积，另一个用来比较大小

        double area1 = getArea(5.5,3.5);
        double area2 = getArea(7.5,1.5);
        compare(area1,area2);
    }

    //定义一个方法求长方形面积
    //1.要干嘛？求长方形面积
    //2.需要什么？长和宽
    //3.方法的调用处是否需要继续使用方法的结果？
    //如果要用就必须要有返回值
    //如果不要用，则返回值可有可没有

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static void compare(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("第一个更大");
        } else if (num1 < num2) {
            System.out.println("第二个更大");
        } else {
            System.out.println("两个一样大");
        }
    }
}
