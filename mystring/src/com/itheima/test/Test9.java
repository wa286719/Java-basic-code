package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        /*
        我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。请定义方法判断用户输入的身份证号码是否合法，
        并在主方法中调用方6法测试结果。规则为：号码为18位，不能以数字0开头，前17位只可以是数字，
        最后一位可以是数字或者大写字母X。
         */
        String ID = "32088220030512021A";
        System.out.println(check(ID));

    }
    public static boolean check(String str) {
        //遍历字符串，校验第一位是否为0，校验前十七位是否为数字，校验最后一位是否为数字或者大写X
        if (str.length() != 18) {
            return false;
        }
        if (str.charAt(0) == '0') {
            return false;
        }
        if (str.charAt(str.length() - 1) < '0' || str.charAt(str.length() - 1) > '9') {
            if (str.charAt(str.length() - 1) != 'X') {
                return false;
            }
        }
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
