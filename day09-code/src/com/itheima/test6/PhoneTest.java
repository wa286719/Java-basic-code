package com.itheima.test6;

public class PhoneTest {
    public static void main(String[] args) {
        //1.定义数组用于存储三个手机对象
        Phone[] arr = new Phone[3];

        //2.创建手机对象
        Phone p1 = new Phone("小米",4999,"黑色");
        Phone p2 = new Phone("华为",2999,"黑色");
        Phone p3 = new Phone("魅族",3999,"黑色");

        //3.把手机对象存入数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //3.求出价格的平均值
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone p = arr[i];
            sum += p.getPrice();
        }
        int avg = sum / arr.length;
        System.out.println("平均价格是" + avg);

    }
}
