package com.itheima.twodimensionarr;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /*
        某商场每个季度中每个月份的营业额如下：
        第一季度：22,66,44
        第二季度：77,33,88
        第三季度：25,45,65
        第四季度：11,66,99
        算出每个季度的总营业额和全年的总营业额
         */

        //分析：
        //1.建立二维数组存入四个一维数组，每个一维数组中存入相应的数据
        //2.遍历每个一维数组求得每个季度的总营业额，然后相加

        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}};
        int yearSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int quarterSum = 0;
            for (int j = 0; j < 3; j++) {
                quarterSum += arr[i][j];
            }
            yearSum += quarterSum;
            System.out.println("第" + (i + 1) + "个季度销售额为：" + quarterSum);
        }
        System.out.println("年度总营业额为：" + yearSum);
    }
}
