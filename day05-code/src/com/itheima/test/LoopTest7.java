package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        //分析：随机生成1~100之间的数字number
        //键盘录入要猜的数字guessNum
        //用for无限循环，判断number和GuessNum是否相等
        //相等则退出循环，大了就返回猜大了，小了就返回猜小了

        //保底机制，猜了三次猜不中就告诉你答案
        //定义一个count来统计猜的次数
        //每次没有猜中的话count++
        //如果count>3，就返回随机数

        //注意：生成随机数的代码不能写在循环里面，否则每次都会产生新的随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        //while和for循环皆可
        while (true) {
            //保底机制，猜了三次猜不中就告诉你答案
            //定义一个count来统计猜的次数
            //每次没有猜中的话count++
            //如果count>3，就返回随机数
            if (count > 3) {
                System.out.println("你太菜啦，告诉你答案吧：" + number);
                break;
            }
            System.out.println("请输入要猜的数字");
            int guessNum = sc.nextInt();
            if (number == guessNum) {
                System.out.println("猜对了");
                break;
            } else if (number > guessNum) {
                System.out.println("猜小了");
                count++;
            } else {
                System.out.println("猜大了");
                count++;
            }
        }
    }
}
