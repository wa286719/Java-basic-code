package com.itheima.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        /*定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
    	并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]*/
        int[] arr = {1,2,3};
        String str =  arrTostring(arr);
        System.out.println(str);
    }

    //定义一个方法
    //需要参数为数组，需要返回值
    public static String arrTostring (int[] arr) {
        String result = "[";
        //不用存储数组中的数据，直接用字符串和它拼接就可以
        for (int i = 0; i < arr.length; i++) {
            //这里需要判断遍历到哪一个索引了，
            //最后一个索引不用加", "
            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result += arr[i] + ",";
            }
        }
        result += "]";
        return result;
    }
}
