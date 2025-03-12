package com.itheima.test;

public class ArrayTest6 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
        交换前：1,2,3,4,5
        交换后：5,2,3,4,1
         */

        //分析：先定义数组存入五个数字
        //怎么交换元素？
        //使用中间变量，先将a赋值给temp
        //然后将b赋值给a
        //再将temp赋值给b

        //1.定义数组存储数据
        int[] arr = {1, 2, 3, 4, 5};
        //2.利用循环去交换数据
        //只有当i在j的左边，即i<j时，才能进行交换
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //交换变量i和变量j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当循环结束之后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*//怎么交换元素？
        //再定义一个有五个元素的空数组，接着遍历数组forij
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int [5];
        for(int i = 0,j = arr1.length - 1;i < arr1.length&&j >= 0;i++,j--) {
            arr2[i] = arr1[j];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/
    }
}
