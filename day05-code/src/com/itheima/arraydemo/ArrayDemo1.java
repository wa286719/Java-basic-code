package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //完整格式：
        //数据类型 [] 数组名 = new 数据类型[]{元素1，元素2，……}
        //简化格式：
        //数据类型 [] 数组名 = {元素1，元素2，……}

        //定义数组存储五个学生的年龄
        int[] arrAge = {15,25,52,21,99};
        int[] arrAge2 = new int[] {15,25,52,21,99};
        //定义数组存储五个学生的姓名
        String [] arrName = {"张三","李四","王五","赵六","马七"};
        String [] arrayName2 = new String [] {"张三","李四","王五","赵六","马七"};
        //定义数组存储五个学生的身高
        double [] arrHeight = {182,189,175.5,173.5,160};
        double[] arrayHeight2 = new double [] {182,189,175.5,173.5,160};
        System.out.println(arrayHeight2); //打印的是地址值，而不是数组内容
        //打印[D@b4c966a
        //[：表示当前是一个数组
        //D：表示当前数组里的元素都是double类型
        //@：表示一个间隔符号
        //b4c966a：才是真正的数组地址值（十六进制）
        //平时习惯性的叫这个整体为数组的地址值
    }
}
