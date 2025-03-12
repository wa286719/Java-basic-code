package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*
        定义一个方法获取数字，在数组中的索引位置，
        将结果返回给调用处，如果有重复的，只要获取第一个即可。
         */

        //分析：
        //1.要干什么？获取数字num在数组中的索引
        //2.需要什么？需要数组、数字
        //在方法中遍历数组，判断哪个元素和num相等
        //使用if语句判断，如果相等则跳出循环，返回索引
        //3.是否需要返回值？需要

        int[] arr = {12, 45, 98, 73, 60};
        int index = getLocation(arr,93);
        System.out.println("索引是：" + index);
    }

    public static int getLocation(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        //如果返回值是boolean类型，也可以上面返回 true，下面返回false
        return -1;
    }
}

//return,break关键字的区别
//return：其实跟循环没什么关系，跟方法有关，表示结束方法和返回结果
//        如果方法执行了return，那么整个方法全部结束，里面的循环也会随之结束

//break：跟方法没什么关系，用于结束循环或者switch