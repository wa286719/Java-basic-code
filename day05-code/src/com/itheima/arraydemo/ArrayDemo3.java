package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.获取数组里面所有的元素
        //格式：数组名[索引]

        //数组的长度属性 length
        //调用方法：数组名.length

        for (int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);

        //拓展：
        //自动生成数组遍历
        //数组名.fori
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.println(arr[i1]);
            }
        }
    }
}
