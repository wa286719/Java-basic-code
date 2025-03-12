package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        /*
        把2135变成：零佰零拾零万贰仟壹佰叁拾伍元
    	把789变成：零佰零拾零万零仟柒佰捌拾玖元
         */
        //1.首先要键盘输入数据，既然有输入数据肯定要检验数据是否正确
        Scanner sc = new Scanner(System.in);
        //因为定义的变量只能在大括号内使用，所以要先定义money，在while循环中赋值
        //不能在while中定义赋值，这样下面就用不了了
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            //在检验数据时想做到如果数据不对就返回重新输入
            //用ctrl alt T来快捷添加while循环
            if (money >=0 && money <= 9999999) {
                break;
            } else {
                System.out.println("请输入正确数据");
            }
        }
        //2.把每一个数据转变成大写形式
        //这里用查表法，即定义一个数组用于存放大写数字，将每一个数字和数组索引相对应
        //这里输入的是每一位数字，因此要先将数字每一位取出再调用方法
        //对money取余，得到每一位

        //这里还是要先将capitalNumber定义在外面
        String moneyStr = "";
        while (money > 0) {
            int number = money % 10;
            //这里要注意取余得到的数据是倒过来的，而字符串拼接也是有顺序的
            String capitalNumber = getCapitalNumber(number);
            moneyStr = capitalNumber + moneyStr;
            //然后在让money/10，去掉已经取余的位
            money = money / 10;
        }
        //3.再补齐零
        //补齐零时需要先判断位数，根据位数来补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        //4.插入单位
        //同样是将单位放进数组中
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        //这里需要对moneyStr进行遍历
        for (int i = 0; i < moneyStr.length(); i++) {
            char ch = moneyStr.charAt(i);
            result = result + ch + arr[i];
        }
        System.out.println(result);
    }
    //查表法，即定义一个数组用于存放大写数字，将每一个数字和数组索引相对应
    //这里输入的是每一位数字，因此要先将数字每一位取出再调用方法
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
