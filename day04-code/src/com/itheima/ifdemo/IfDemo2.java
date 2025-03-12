package com.itheima.ifdemo;

public class IfDemo2 {
    public static void main(String[] args) {
        /*if的注意点：
        1.大括号的开头最好写在第一行的末尾
        2.在语句体中，如果只有一句代码，大括号可以省略不写，但是最好写
        3.如果对一个布尔类型的变量进行判断，不要用==号，因为如果漏写一个=，就会变成赋值。
        因此直接将变量写在小括号里。
         */

        int number = 10;
        if(number > 10) {
            System.out.println("The number is greater than 10");
        }

        boolean flag = false;
//        if(flag == true) {
//            System.out.println("The flag is true");
//        }
        if(flag) {
            System.out.println("The flag is true");
        }
    }
}
