package com.itheima.homework;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
        也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
        如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
    	0 ~ 3000元的部分，交税3%
    	3000 ~ 12000元的部分，交税10%
    	12000 ~ 25000的部分 ， 交税20%
    	25000 ~ 35000的部分，交税25%
    	35000 ~ 55000的部分，交税30%
    	55000 ~ 80000的部分，交税35%
    	超过80000的部分，交税45%

        比如：黑马某学员入职一家企业后，税前工资是15000，
        则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
        请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
         */

        //首先用户输入工资金额income
        //income * 0.9表示扣除三险一金后的金额
        //比较income和5000大小，如果小于5000则直接输出
        //定义double类型beyondMoney表示超出5000的部分
        //如果大于5000，则比较beyondMoney的大小判断交税部分
        //定义trueIncome表示交完税到手部分
        //输出trueIncome2

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工资金额：");
        double income = sc.nextInt();
        //定义税金tax表示要交的税款总额
        double tax = 0;
        //定义六个level表示不同阶段的全额税款
        double level1 = 3000 * 0.03;
        double level2 = 3000 * 0.03 + 9000 * 0.1;
        double level3 = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2;
        double level4 = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25;
        double level5 = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3;
        double level6 = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 20000 * 0.3 + 30000 * 0.35;
        //表示扣完三险一金后的金额
        income *= 0.9;
        if (income > 5000) {
            double beyondMoney = income - 5000;
            if (beyondMoney <= 3000) {
                tax = beyondMoney * 0.03;
/*                income = income - tax;
                System.out.println("税后工资为：" + income + "元");
                System.out.println("实际交税：" + tax + "元");*/
            } else if (beyondMoney <= 12000) {
                tax = level1 + (beyondMoney - 3000) * 0.1;
/*                income = income - tax;
                System.out.println("税后工资为：" + income + "元");
                System.out.println("实际交税：" + tax + "元");*/
            } else if (beyondMoney <= 25000) {
                tax = level2 + (beyondMoney - 12000) * 0.2;
/*                income = income - tax;
                System.out.println("税后工资为：" + income + "元");
                System.out.println("实际交税：" + tax + "元");*/
            } else if (beyondMoney <= 35000) {
                tax = level3 + (beyondMoney - 25000) * 0.25;
/*                income = income - tax;
                System.out.println("税后工资为：" + income + "元");
                System.out.println("实际交税：" + tax + "元");*/
            } else if (beyondMoney <= 55000) {
                tax = level4 + (beyondMoney - 35000) * 0.3;
/*                income = income - tax;
                System.out.println("税后工资为：" + income + "元");
                System.out.println("实际交税：" + tax + "元");*/
            } else if (beyondMoney <= 85000) {
                tax = level5 + (beyondMoney - 55000) * 0.35;
/*                income = income - tax;
                System.out.println("税后工资为：" + income + "元");
                System.out.println("实际交税：" + tax + "元");*/
            } else {
                tax = level6 + (beyondMoney - 85000) * 0.45;
/*                income = income - tax;
                System.out.println("税后工资为：" + income + "元");
                System.out.println("实际交税：" + tax + "元");*/
            }


        } /*else {
            System.out.println("税后工资为：" + income + "元");
            System.out.println("实际交税：" + tax + "元");
        }*/
        income = income - tax;
        System.out.println("税后工资为：" + income + "元");
        System.out.println("实际交税：" + tax + "元");
    }
}
