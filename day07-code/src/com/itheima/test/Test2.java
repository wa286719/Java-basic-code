package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        判断101~200之间有多少个素数，并输出所有素数。
         */

        //分析：
        //1.使用for循环，在101~200之间遍历所有数字
        //2.要怎么样去判断素数？
        //3.取这个数的一半赋值给变量temp，向左遍历到2，不断对i取余，
        // 定义count用于计数，如果有取余结果为0的，count++，
        // 若count>0说明不是素数
        int num = 0;
        //外循环遍历10~200之间所有的数字，得到这些数字
        for (int i = 101; i < 201; i++) {
            int count = 0;
            int temp = i / 2;
            //内循环判断当前数字是否为一个质数
            for (int i1 = temp; i1 > 1; i1--) {
                if (i % i1 == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + "  ");
                num++;
            }
        }
        System.out.println();
        System.out.println("一共有" + num + "个素数");

    }
}
