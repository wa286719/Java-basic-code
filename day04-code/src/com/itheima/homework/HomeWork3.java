package com.itheima.homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：

        存期		年利率（%）
        一年		2.25
        两年		2.7
        三年		3.25
        五年		3.6
        请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
        提示：
    	存入金额和存入年限均由键盘录入
    	本息计算方式：本金+本金×年利率×年限
         */

        //分析：键盘输入存入金额deposit，再输入存入年限year（1-4年）
        //定义money表示本息总额
        //使用if-else if语句来计算本息总额

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入金额：");
        double deposit = sc.nextInt();
        System.out.println("请输入存入年限：");
        int year = sc.nextInt();
        double money = 0;
/*        //使用switch语句
        switch (year) {
            case 1 :
                money = deposit + deposit * 0.0225;
                System.out.println(money);
                break;
            case 2 :
                money = deposit + deposit * 0.027;
                System.out.println(money);
                break;
            case 3 :
                money = deposit + deposit * 0.0325;
                System.out.println(money);
                break;
            case 5 :
                money = deposit + deposit * 0.036;
                System.out.println(money);
                break;
            default :
                System.out.println("请输入正确年限");
        }*/

        //判断输入的年限是否有误
        if (year == 1 || year == 2 || year == 3 || year == 5) {
            if (year == 1) {
                money = deposit + deposit * 0.0225;
                System.out.println("本息总额为：" + money);
            } else if(year == 2) {
                money = deposit + deposit * 0.027;
                System.out.println("本息总额为：" + money);
            } else if(year == 3) {
                money = deposit + deposit * 0.0325;
                System.out.println("本息总额为：" + money);
            } else {
                money = deposit + deposit * 0.036;
                System.out.println("本息总额为：" + money);
            }
        } else {
            System.out.println("请输入正确年限");
        }


    }
}
