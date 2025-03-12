package com.itheima.homework;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        定义一个数组其中包含多个数字。
        用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
        （可以创建其他数组，不必须在原数组中改变）
         */

        /*
        不定义新数组。找到左边的偶数，和右边的奇数互换位置。
         */

        //分析：
        //1.定义数组arr并存入元素
        //2.定义奇数索引oddIndex用于存放下一个奇数的位置
        //3.遍历数组，从0开始，使用if语句判断arr[i]是否为奇数数
        //4.如果是奇数，则交换奇数到前面
        int[] numbers = {12, 3, 5, 8, 9, 10, 1, 6};
        int oddIndex = 0; // 用来存放下一个奇数的位置

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                // 交换奇数到前面
                int temp = numbers[i];
                numbers[i] = numbers[oddIndex];
                numbers[oddIndex] = temp;
                oddIndex++;
            }
        }

        // 输出结果
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[j] % 2 != 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    j--;
                } else {
                    j--;
                }
            }
        }*/


        /*        *//*
        1. 定义出原数组arr，其中包含多个数字。
        2. 定义新数组brr，和arr的长度一样。
        3. 定义变量left，初始值是0准备从左边放元素，定义变量right，初始值是arr.length-1准备从右边放元素。
        4. 对原数组arr进行遍历。
        5. 如果元素是奇数，则放在新数组brr的左边，left变量加一。
        6. 如果元素是偶数，则放在新数组brr的右边，right变量减一。
        7. 遍历新数组brr打印最终结果。
         *//*

        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        int[] brr = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                brr[left] = arr[i];
                left++;
            } else {
                brr[right] = arr[i];
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("  ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + "  ");
        }*/
    }
}
