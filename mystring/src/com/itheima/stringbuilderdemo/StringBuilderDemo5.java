package com.itheima.stringbuilderdemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回。
          调用该方法，并在控制台输出结果。
          例如：数组为int[] arr = {1,2,3};
          执行方法后的输出结果为：[1, 2, 3]
         */

        //1.先定义数组
        int[] arr = {1, 2, 3};

        //3.调用方法
        System.out.println(arrToString(arr));
    }

    //2.定义方法用于拼接
    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            //进行判断，如果i是最后一个索引，直接拼接
            //如果不是，则除了拼接数组元素外还要拼接,
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
