package com.itheima.test;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("调用change方法前：" + arr[1]);
        //使用引用数据类型时，传递的是地址值，形参的改变影响实际参数的值
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
