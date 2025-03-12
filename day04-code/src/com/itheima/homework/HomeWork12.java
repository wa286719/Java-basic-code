package com.itheima.homework;

public class HomeWork12 {
    public static void main(String[] args) {
        /*
        已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
         */
        /*
        1. 定义for循环，1949到2019的年份是循环次数。
        2. 对每个年份逐个判断，如果年份和2019的差值是12的倍数，说明这年是猪年
        3. 打印符合条件的年份
         */
        for (int year = 1949; year <= 2019; year++) {
            if ((2019 - year) % 12 == 0) {
                System.out.println(year);
            }
        }

        //分析：12年一轮回，则2019不断-12然后输出

/*        int year = 2019;
        while (year >= 1949) {
            System.out.println(year);
            year -= 12;
        }*/


    }
}
