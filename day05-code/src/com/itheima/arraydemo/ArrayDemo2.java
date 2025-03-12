package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //利用索引对数组中的元素进行访问
        //1.获取数组中的元素
        //格式：数组名[索引]
        int[] arr = {1,2,3,4,5};

        //获取数组中的第一个元素
        //就是0索引上对应的元素
        int number = arr[0];
        System.out.println(number);

        //获取1索引上对应的数据，并打印出来
        System.out.println(arr[1]);//2


        //2.把数据存储到数组中
        //格式：数组名[索引] = 具体数据/变量

        arr[0] = 100;
        System.out.println(arr[0]);

    }
}
