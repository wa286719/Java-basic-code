package com.itheima.test;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        /*
        需求：
        一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面的顺序）
        1888元的奖金被抽出
        2588元的奖金被抽出
        310000元的奖金被抽出
        41000元的奖金被抽出
        52元的奖金被抽出
         */

        //定义数组表示奖池
        int[] arr = {2, 588, 888, 1000, 10000};
        draw(arr);

        //分析：
        //1.定义一个数组arr用于存放五个奖金，再定义一个数组brr用于存放已经被抽出的奖金，
        // brr长度和arr相等，定义count用于统计brr中元素数量
        //2.定义随机数，在arr中每抽出一个数字，就先和brr数字对比，看brr中是否有
        // 如果有，则重新抽取，如果没有则先添加进brr再打印，并且brr中元素数count++
    }

    //定义void类型方法draw表示抽奖
    public static void draw(int[] arr) {
        //定义一个数组brr用于存放已经被抽出的奖金
        int[] brr = new int[arr.length];
        //定义count用于统计brr中元素数量
        int count = 0;
        Random r = new Random();
        //当brr未存满时
        while (count < arr.length) {
            int randomIndex = r.nextInt(arr.length);
            //在arr中每抽出一个数字，就先和brr数字对比
            //如果brr中已有，则重新抽取
            if (arr[randomIndex] != brr[randomIndex]) {
                //如果没有则先添加进brr再打印，并且brr中元素数count++
                brr[randomIndex] = arr[randomIndex];
                System.out.println(arr[randomIndex] + "元奖金被抽出");
                count++;
            }
        }
    }
}
