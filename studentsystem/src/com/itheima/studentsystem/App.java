package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user = new User("wa", "wa286719", "001", "110");
        list.add(user);
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作1登录 2注册 3忘记密码");
        System.out.println("请选择操作");
        int choice = sc.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    login(list);
                    break;
                case 2:
                    System.out.println("注册");
                    break;
                case 3:
                    System.out.println("忘记密码");
                    break;
                default:
                    break;
            }
        }

        //登录界面，包括注册、登录、忘记密码等功能

    }

    //check方法用于检验变量在集合中是否存在
    public static boolean checkContains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (username.equals(list.get(i).getUserName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkVerCode(String ver, String verCode) {
        if (verCode.equalsIgnoreCase(ver)) {
            return true;
        }
        return false;
    }

    public static boolean checkUserInfo(ArrayList<User> list, User user) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(user.getUserName()) && list.get(i).getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public static String verificationCode() {
        //注意：如何将int型数字转变为char类型？
        //使用arr[num3] = Integer.toString(num3).charAt(0)方法
        //思路：利用循环将所有的大小写字母加入到数组中
        //利用ASCII码表
        Random r = new Random();
        //num2用于生成0-9的随机数
        int num2 = r.nextInt(10);
        //num3用于生成0-3随机数交换位置
        int num3 = r.nextInt(4);
        char[] letter = new char[52];
        //将大小写字母添加到数组中
        for (int i = 0; i < 26; i++) {
            letter[i] = (char) ('A' + i);
        }
        for (int i = 26; i < letter.length; i++) {
            letter[i] = (char) ('a' + i - 26);
        }
        //先定义一个长度为4的数组用于存放大小写字母
        char[] arr = new char[4];
        //将字母拼接在数组前四位
        for (int i = 0; i < arr.length; i++) {
            int num1 = r.nextInt(52);
            arr[i] = letter[num1];
        }
        //将数字拼接在最后一位
        //要怎么拼接呢？字符没有办法直接+数字，可以将字符数组转变为字符串
        String str = new String(arr);
        str += num2;
        //再将字符串转变为字符数组
        arr = str.toCharArray();
        //遍历数组，交换位置
        char temp = arr[num3];
        arr[num3] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        String verCode = new String(arr);
        return verCode;
    }

    public static void login(ArrayList<User> list) {
        //生成三次循环，代表登录一共三次机会
        for (int i = 0; i < 3; i++) {
            //调用验证码方法生成验证码
            String rightVer = verificationCode();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            //检查用户是否注册
            if (!checkContains(list, username)) {
                System.out.println("当前用户尚未注册！");
                return;
            }
            System.out.println("请输入密码：");
            String password = sc.next();
            //验证验证码是否输入正确
            while (true) {
                System.out.println("请输入验证码：" + rightVer);
                String verCode = sc.next();
                if (checkVerCode(rightVer, verCode)) {
                    break;
                } else {
                    System.out.println("验证码输入错误，请重新输入");
                }
            }
            //封装思想
            //验证用户名和密码是否正确，可以新建一个user对象，将这些零碎信息封装进对象中
            //传递参数时传递对象就可以，不用传递这些零碎的数据
            User userInfo = new User(username, password, null, null);
            //定义了checkUserInfo方法，用于校验用户名与密码是否匹配

            if (checkUserInfo(list, userInfo)) {
                //不推荐使用类的实例来访问静态方法
                //StudentSystem ss = new StudentSystem();
                System.out.println("学生管理系统已启动");
                //可以直接用类本身来访问方法
                StudentSystem.main();
                return;
            } else {
                System.out.println("账户或密码错误，请重试");
                if (i == 2) {
                    System.out.println("登陆失败，账户已锁定");
                    System.exit(0);
                }
            }
        }
    }

    public static boolean checkUserName(ArrayList<User> list, String username) {
        int countNum = 0;
        //判断用户名是否含有非法字符
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) > 'a' && username.charAt(i) < 'z') {
                continue;
            } else if (username.charAt(i) >= '0' && username.charAt(i) <= '9') {
                countNum++;
            } else {
                return false;
            }
        }
        //判断用户名是否为纯数字
        if (countNum == username.length()) {
            return false;
        }
        //判断用户名长度是否正确
        if (username.length() < 3 || username.length() > 15) {
            return false;
        }
        //判断用户名是否唯一
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //输入用户名并验证
            System.out.println("请输入用户名：");
            String username = sc.next();
            if (checkContains(list, username)) {
                break;
            }
        }
    }
}
