package com.itheima.test;

public class LoopTest4 {
    public static void main(String[] args) {
        //100000
        //2~99999
        //循环次数过多

        //简化思路
        //81可分成 1*81 3*27 9*9

        //以81的平方根9为中心
        //假设a * b = 81
        //那么a和b中，一定有一个小于9，另一个大于9

        int number = 100;
        //如果这个范围内所有数字都不能被number整除
        //那么number就一定是一个质数
/*        for (int i = 2; i <= number的平方根; i++) {

        }*/

    }
}
