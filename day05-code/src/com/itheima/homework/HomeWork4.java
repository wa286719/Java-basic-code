package com.itheima.homework;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，
        依次表示整数的个位、十位、百位。。。
        依次类推。请编写程序计算，这个数组所表示的整数值。例如：
        数组：{2, 1, 3, 5, 4}
        表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
         */

        //分析：定义一个长度为5的数组
        //定义变量num用于存放最终数字
        //先将arr[0]赋值给num
        //遍历数组，num += arr[i]
        //然后将num的值自乘10

        int[] arr = {2,1,6,8,4};
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num *= 10;
            num += arr[i];
        }
        System.out.println(num);

    }
}
