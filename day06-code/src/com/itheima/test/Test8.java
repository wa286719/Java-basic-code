package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法copyOfRange(int[] arr,int from,int to)
        将数组arr中从索引from（包含from）开始到索引to结束（不包含to）
        的元素复制到新数组中，将新数组返回
         */

        //分析：
        //1.要干什么？将原数组中的一段数字取出存入新数组
        //2.需要什么？数组、数组
        //3.是否有返回值？有，返回新数组

        int[] arr = {12, 45, 98, 73, 60, 59, 88, 78};
        int[] brr = copyOfRange(arr, 2, 6);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + "  ");
        }

    }
    // 先创建一个新数组brr
    // 遍历数组arr，从from开始到to结束中的每一个数字都存入brr中
    // 注意，在遍历存储的过程中，brr的元素是从0开始到to-from结束，即brr[i-from]

    //这个方法返回的是数组，因此在定义时要定义数组类型
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] brr = new int[to - from];
        //伪造索引：
        //当在使用数组时找不到能够表达数组索引的时候
        //定义一个index=0用来表示索引
        //int index = 0;
        for (int i = from; i < to; i++) {
            /*brr[index] = arr[i];
            index++;*/
            brr[i - from] = arr[i];
        }
        //这里返回的brr是brr的地址值
        return brr;
    }
}
