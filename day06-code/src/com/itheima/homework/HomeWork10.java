package com.itheima.homework;

public class HomeWork10 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个方法copyOfRange(int[] arr,int from, int to)
        功能：
        将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，
        并将新数组返回。
         */
        int[] arr = {89,55,74,86,1,2,3};
        arr = copyOfRange(arr, 1, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    //分析：
    //1.定义一个int[]型方法，方法有三个参数
    //2.定义新数组brr，用于复制元素
    //3.遍历arr，从from开始到to结束，将arr[i]赋值给brr[i]
    //4.返回brr
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] brr = new int[to - from];
        for (int i = from; i < to; i++) {
            brr[i - from] = arr[i];
        }
        return brr;
    }
}
