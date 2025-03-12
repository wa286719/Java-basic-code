package com.itheima.twodimensionarr;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        /*
        动态初始化：
            格式：数据类型\[][] 数组名 = new 数据类型\[m][n];
            m表示这个二维数组可以存放多少个一维数组
            n表示每个一维数组可以存放多少个元素
         */

        //1.利用动态初始化创建二维数组
        //3：表示二维数组长度为3，可以存放3个一维数组
        //5：表示一维数组长度为5，可以存放5个元素
        int[][] arr = new int[3][5];

        //给二维数组赋值一个元素
        arr[0][0] = 10;

        //遍历二维数组
        //外循环：遍历二维数组获取每一个一维数组
        //内循环：遍历一维数组获取每一个元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
