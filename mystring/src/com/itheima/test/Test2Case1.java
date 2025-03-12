package com.itheima.test;

public class Test2Case1 {
    public static void main(String[] args) {
        /* 给定两个字符串, A和B。
        A的旋转操作就是将A 最左边的字符移动到最右边。
        例如, 若A = 'abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false*/

        //大体思路：可以用StringBuilder构建abcdeabcde
        //调整操作最多只会执行A.length()次，所以每执行一次就从某一个位置截取A.length()个字符

        //！！！！！！注意点：substring(startIndex,endIndex)是从开始索引截取到结束索引
        //结束索引是固定的索引值，如果在循环中则需要endIndex + i达到动态截取固定长度的效果

        //1.给定两个字符串
        String A = "abcde";
        String B = "cdeba";

        //2.定义StringBuilder
        System.out.println(check(A, B));



    }
    public static boolean check(String A, String B) {
        //2.定义StringBuilder
        StringBuilder sb = new StringBuilder(A);
        sb.append(A);
        //3.循环执行操作，
        for (int i = 0; i < A.length(); i++) {
            //注意点：substring(startIndex,endIndex)是从开始索引截取到结束索引
            //结束索引是固定的索引值，如果在循环中则需要endIndex + i达到动态截取固定长度的效果
            String newA = sb.substring(i,A.length() + i);
            if (newA.equals(B)) {
                return true;
            }
        }
        return false;
    }
}
