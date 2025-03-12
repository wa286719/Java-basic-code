package com.itheima.test;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        //需求：生成范围1~100的随机数

        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);

        /*
        生成任意数到任意数之间的随机数 7~15
        1.范围头尾都减去一个值，让范围从0开始 -7 0~8
        2.尾巴+1 8+1=9
        3.最终结果再加上第一步减掉的值
         */

/*        Random r = new Random();
        int number = r.nextInt(9);
        number += 7;
        System.out.println(number);*/

    }
}
