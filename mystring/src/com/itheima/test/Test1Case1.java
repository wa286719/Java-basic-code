package com.itheima.test;

import java.util.Scanner;

public class Test1Case1 {
    public static void main(String[] args) {
        //！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
        //本题重难点：
        //1.在检测是否符合条件时，这里如果想要直接在循环中检测是否符合条件很难，循环很难跳出
        //我们可以定义一个Boolean方法，在方法中检测
        //2.查表法，用需要替换掉数字作为索引来取数组中元素
        //可以直接返回所查到的数据
        //3.！！！！！！！！！！！如果需要在循环中输入而循环结束后也要用到输入
        //可以在循环外先定义String str，然后在循环内调用输入方法
        //4.复杂代码可以抽象成方法放在下面，主方法中留存少量代码即可


        /* 键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
                将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：
        Ⅰ－1、Ⅱ－2、Ⅲ－3、Ⅳ－4、Ⅴ－5、Ⅵ－6、Ⅶ－7、Ⅷ－8、Ⅸ－9
        注意点：
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/

        //!!!!!!!!!重点！！！！！！
        // 这里如果想要直接在循环中检测是否符合条件很难，循环很难跳出
        //我们可以定义一个Boolean方法，在方法中检测

        //1.先录入一个字符串
        Scanner sc = new Scanner(System.in);
        //3.如果需要在循环中输入而循环结束后也要用到输入
        //可以在循环外先定义String str，然后在循环内调用输入方法
        String str;
        //2.调用方法判断输入的字符串是否符合条件
        while (true) {
            System.out.println("请输入一个字符串：");
            str = sc.nextLine();
            if (check(str)) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String number = changeRoman(c - 48);
            sb.append(number);
        }
        System.out.println(sb);

    }

    //4.定义一个方法用于转换罗马数字,注意0换成空字符'\0'！！！！
    public static String changeRoman(int number) {
        String[] Roman = new String[]{"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return Roman[number];
    }

    //3.定义一个方法用于检测输入值是否符合条件
    public static boolean check(String str) {
        if (str.length() > 9) {
            System.out.println("输入的字符串长度有误，请重新输入");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                System.out.println("输入字符串格式有误，请重新输入");
                return false;
            }
        }
        //只有当所有判断完毕没有问题之后才返回true
        return true;
    }
}
