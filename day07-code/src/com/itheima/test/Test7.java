package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
        把上一题加密之后的数据进行解密
        某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        规则如下：
        先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
        举例：
                1	9	8	3
        +5		6   14  13  8
        %10		6   4   3   8
        反转	   8   3   4   6
        加密后的结果就是：8346
         */

        //分析：
        //1.在上一题中用的是数组来获取每一个数，数组在获取时就已经将数组倒置
        //2.同样的先获取数字的位数，然后将其存入数组中，那在存入数组的过程中就已经将数字倒置反转
        //3.剩下来就是反向操作，将数组中每个数字先加10，再减5，如果得到结果大于10，就再减10，小于10就不变，
        // 这里可以放在方法中
        //4.最后输出

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入待解密的密码：");
        int num = sc.nextInt();
        int num1 = num;
        int num2 = num;
        int length = 0;
        //使用循环让num/10，判断num的位数，令length++
        while(num1 > 0) {
            num1 /= 10;
            length ++;
        }
        //定义数组arr，长度为length
        int[] arr = new int[length];
        //遍历arr，将num的每一位存入arr中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num2 % 10;
            num2 /= 10;
        }
        //执行解密
        arr = decrypt(arr);
        System.out.print("解密后的密码是：" + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
    //将数组中每个数字先加10，再减5，如果得到结果大于10，就再减10，小于10就不变
    //定义解密方法
    public static int[] decrypt(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
            arr[i] -= 5;
            if (arr[i] >= 10) {
                arr[i] -= 10;
            }
        }
        return arr;
    }
}
