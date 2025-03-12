package com.itheima.test;

public class test10 {
    public static void main(String[] args) {
        /*
        定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
        要求：1、如果传递的参数为空，返回null
        2、如果传递的数组元素个数为0，返回[]
        3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
         */

        //!!!!!!!!!!!!!!!!
        //空数组和长度为0的区别
        //数组为空说明数组不指向任何对象
        //长度为0指已经初始化数组了但不包含任何元素
        int[] arr = null;
        System.out.println(arrToString(arr));
    }
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return null;
        } else if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
                sb.append("]");
            } else {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
