package com.itheima.homework;

import java.util.Random;

public class HomeWork11 {
    public static void main(String[] args) {
        /*
        一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面的顺序）
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出
         */

        //在主函数中将奖金存入数组中
        int[] arr = {2,588,888,1000,10000};
        print(arr);
    }

    //分析：
    //定义一个数组存放奖金，每当有奖金被抽出时就将这个元素赋值为0
    //如果所有元素都为0的话，说明所有奖金都被抽走了

    //1.定义一个void类型方法print，可以随机打印数组元素，方法中有一个形参int[] arr
    public static void print(int[] arr) {
        //new一个随机数
        Random r = new Random();
        //2.遍历arr，要求随机打印且不重复，那么每打印一个元素就将其赋值为0
        while (true) {
            int index = r.nextInt(arr.length);
            if (arr[index] == 0) {
                continue;
            } else {
                System.out.println(arr[index] + "元的奖金被抽出");
                arr[index] = 0;
            }
            //如何去判断数组中所有元素都为0？
            //定义一个totalNum用于统计数组内为0元素的个数
            //如果totalNum = 数组长度，则数组内元素全为0
            int totalNum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    totalNum++;
                }
            }
            if (totalNum == arr.length) {
                break;
            }
        }
    }

    //3.
}
