package com.itheima.a02staticdemo2;

public class TestDemo {
    //测试类，要包含main方法
    public static void main(String[] args) {
        //调用打印数组方法和求平均值方法
        int[] arr1 = {1,2,3,4,5,6};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.1,1.2,3.5,6.3};
        double v = ArrayUtil.setAverage(arr2);
        System.out.println(v);
    }
}
