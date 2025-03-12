package com.itheima.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        /*定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
    	例如，键盘录入 abc，输出结果 cba*/
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length(); i > 0; i--) {
            //可以直接用快捷键str.length().forr来倒过来遍历
            char temp = str.charAt(i - 1);
            result += temp;
        }
        return result;
    }
}
