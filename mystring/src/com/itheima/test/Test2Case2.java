package com.itheima.test;

public class Test2Case2 {
    public static void main(String[] args) {
        /* 给定两个字符串, A和B。
        A的旋转操作就是将A 最左边的字符移动到最右边。
        例如, 若A = 'abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false*/

        //大体思路：将字符串放在数组中，每次旋转都是将第一位放最后，其余各位向前挪


        //1.给定两个字符串
        String A = "abcde";
        String B = "cdeab";
        System.out.println(check(A, B));
    }

    public static boolean check(String A, String B) {
        for (int i = 0; i < A.length(); i++) {
            A = rotate(A);
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        //数组内容移位思路
        //取出第一个元素赋值给temp，其余元素在循环中赋值给前一个元素，最后将temp赋值给最后一个元素
        char[] arr = str.toCharArray();
        char temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        String newstr = new String(arr);
        return newstr;
    }
}
