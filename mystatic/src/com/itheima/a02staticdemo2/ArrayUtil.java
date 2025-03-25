package com.itheima.a02staticdemo2;

public class ArrayUtil {
    /*
    在工具类中构建两个方法，分别是printArr以及getAverage
    用于打印数组和输出平均分
     */
    //私有化构造方法，不让外界创建它的对象
    private ArrayUtil() {}

    //需要将方法定义为静态，方便调用
    public static String printArr(int[] arr) {
        //既然要打印数组就可以用StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            //先判断是否为最后一个元素，最后一个元素只需要添加元素即可
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double setAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
