package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //！！！！！！！！！！！！！！！！！！！
        //！！！！！！！！！！！！！！！！！！！
        //封装思想：在校验用户登录时输入的用户名密码等时，可以将其封装成一个用户类
        //其他参数设置为null，然后定义方法来比较该用户对象和集合中用户对象的信息是否匹配

        //访问其他类的方法时，可以直接用类名.方法名来访问，但应该要在同一个包下

        //开发过程中如果需要用户录入数据要先验证数据是否合法，再验证唯一性
        ArrayList<User> list = new ArrayList<>();
        User user = new User("wa", "wa286719", "001", "110");
        list.add(user);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            System.out.println("请选择操作");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    login(list);
                    break;
                case 2:
                    register(list);
                    break;
                case 3:
                    forgetPassword(list);
                    break;
                default:
                    break;
            }
        }

        //登录界面，包括注册、登录、忘记密码等功能

    }

    //check方法用于检验用户名在集合中是否存在,存在返回true
    public static boolean checkContains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (username.equals(list.get(i).getUserName())) {
                return true;
            }
        }
        return false;
    }

    //检查输入的验证码和生成的验证码是否相同，相同返回true
    public static boolean checkVerCode(String ver, String verCode) {
        if (verCode.equalsIgnoreCase(ver)) {
            return true;
        }
        return false;
    }

    //检查登陆时封装的user对象与集合中对象的用户名和密码是否相同，相同返回true
    public static boolean checkUserInfo(ArrayList<User> list, User user) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(user.getUserName()) && list.get(i).getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //生成验证码
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

    //登录
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

    //检查用户名是否合法，不合法则返回false
    public static boolean checkUserName(ArrayList<User> list, String username) {
        int countNum = 0;
        //判断用户名是否含有非法字符
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) >= 'a' && username.charAt(i) <= 'z') {
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

    //检查两次输入密码是否一致，不一致则返回false
    public static boolean checkPassword(String pwd1, String pwd2) {
        if (pwd1.equals(pwd2)) {
            return true;
        }
        System.out.println("两次密码输入不一致，请重新输入！");
        return false;
    }

    //检查输入的身份证号是否正确，不正确则返回false
    public static boolean checkId(String id) {
        //长度为18
        if (id.length() != 18) {
            System.out.println("身份证长度错误，请重新输入！");
            return false;
        }
        //首位数不为0
        if (id.charAt(0) == '0') {
            System.out.println("身份证格式错误，请重新输入！");
        }
        //除第18位可以位x或X或数字外，其余各位均为数字
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                if (i == id.length() - 1 && (id.charAt(i) == 'x' || id.charAt(i) == 'X')) {
                    return true;
                }
                System.out.println("身份证格式错误，请重新输入！");
                return false;
            }
        }

        return true;
    }

    //检查输入的手机号是否正确，不正确则返回false
    public static boolean checkPhoneNum(String phoneNum) {
        //长度为11位且不以0开头
        if (phoneNum.length() != 11 || phoneNum.charAt(0) == '0') {
            System.out.println("输入手机号有误，请重新输入！");
            return false;
        }
        return true;
    }

    //注册
    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        //创建一个用户对象，将用户名等信息封装其中
        User user = new User();
        //输入用户名并验证
        while (true) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            //检查用户名是否已存在
            //开发过程中如果需要用户录入数据要先验证数据是否合法，再验证唯一性
            if (!checkUserName(list, username)) {
                System.out.println("用户名不合法，请重新输入");
                continue;
            } else if (checkContains(list, username)) {
                System.out.println("用户名已存在，请重新输入");
                continue;
            } else {
                user.setUserName(username);
                break;
            }
        }
        //输入密码并验证
        while (true) {
            System.out.println("请输入密码");
            String pwd1 = sc.next();
            System.out.println("请再次输入密码");
            String pwd2 = sc.next();
            if (checkPassword(pwd1, pwd2)) {
                user.setPassword(pwd1);
                break;
            }
        }
        //输入身份证号并验证
        while (true) {
            System.out.println("请输入身份证号");
            String id = sc.next();
            if (checkId(id)) {
                user.setId(id);
                break;
            }
        }
        //输入手机号并验证
        while (true) {
            System.out.println("请输入手机号码");
            String phoneNum = sc.next();
            if (checkPhoneNum(phoneNum)) {
                user.setPhoneNumber(phoneNum);
                break;
            }
        }
        list.add(user);
    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        if (!checkContains(list, username)) {
            System.out.println("该用户未注册");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(username)) {
                System.out.println("请输入身份证号");
                String id = sc.next();
                System.out.println("请输入手机号");
                String phoneNum = sc.next();
                if (list.get(i).getPhoneNumber().equals(phoneNum) && list.get(i).getId().equals(id)) {
                    System.out.println("请输入新密码");
                    String newPassword = sc.next();
                    list.get(i).setPassword(newPassword);
                    System.out.println("密码修改成功");
                } else {
                    System.out.println("账户信息不匹配，修改失败！");
                    break;
                }
            }
        }
    }
}
