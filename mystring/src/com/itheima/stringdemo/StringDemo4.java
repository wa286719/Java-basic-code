package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //已知用户名和密码
        //定义admim和pwd
        String rightUsername = "admin";
        String rightPwd = "1234";



        //判断用户名和密码是否匹配，使用equals
        for (int i = 2; i >= 0; i--) {//或者用for(int i = 0,i < 3, i++),然后还剩(2-i)次机会
            //用户输入用户名和密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username = sc.nextLine();
            System.out.println("请输入密码:");
            String pwd = sc.nextLine();
            if (rightUsername.equals(username) && rightPwd.equals(pwd)) {
                System.out.println("登陆成功！");
                break;
            } else {
                if (i == 0) {
                    //次数用完，提示账户被锁定
                    System.out.println("登录失败，您的账户已被锁定");
                } else {
                    System.out.println("登陆失败，还有" + i + "次机会");
                }
            }
        }

    }
}
