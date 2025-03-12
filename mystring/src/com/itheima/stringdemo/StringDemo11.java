package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //通过身份证号码获取出生年月日和性别
        //7-14位：出生年、月、日 17位：性别（奇数男性，偶数女性）
        //1.获得身份证号
        String id = "320882200505083875";
        //2.截取不同的长度获得出生日期和性别
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        //获取性别识别号可以用id.charAt，因为只获取一位就可以
        char gender = id.charAt(16);

        //3.输出信息
        System.out.println("身份信息：");
        System.out.println(year + "年" + month + "月" + day + "日");
        //对性别判断比较特殊，需要对性别识别号取余
        //而获得的性别识别号是字符型
        //如何将字符型转变为int型？
        //利用ASCII码表
        //System.out.println('0' + 0);查看0对应的ASCII码表值
        //用识别号-48即可得到对应int类型数值
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
