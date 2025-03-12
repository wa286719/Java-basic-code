package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*
        投注号码由6个红球号码和1个蓝球号码组成
        红球号码1~33，蓝球号码1~16
         */

        //分析：
        //1.首先键盘录入六个红球号码和一个蓝球号码，
        // 红球号码通过循环录入，将录入的数字存入数组numArr中，在录入时需要判断号码范围以及是否重复，
        //2.随机生成七位数中奖号码存入数组priceArr中，前六位是红球，第七位是蓝球，且红球中奖号码不能重复
        //3.接下来定义countRed，countBlue用于计数，遍历numArr前六位，每一位再遍历一次priceArr，
        // 看看numArr[i]和priceArr[i]有几个相等，红球有相等的则countRed++，蓝球则是countBlue++


        //生成中奖号码数组
        int[] priceArr = new int[7];
        getPriceNumber(priceArr);
        System.out.print("中奖号码是：");
        for (int i = 0; i < priceArr.length; i++) {
            System.out.print(priceArr[i] + "  ");
        }
        System.out.println();
        //生成抽奖号码数组
        int[] numArr =  getNumArr();

        //4.统计中奖的红球和蓝球个数,前六个红球判断一次，第七个蓝球再判断一次
        // 则需要定义一个countRed,一个countBlue，每有一个相同则count++
        int countRed = 0;
        int countBlue = 0;
        //判断红球中奖个数
        for (int i = 0; i < numArr.length - 1; i++) {
            for (int i1 = 0; i1 < priceArr.length - 1; i1++) {
                if (numArr[i] == priceArr[i1]) {
                    countRed++;
                    break;
                }
            }
        }
        //判断蓝球中奖个数
        if (numArr[6] == priceArr[6]) {
            countBlue++;
        }
        money(countRed, countBlue);
    }

    //1.定义生成抽奖号码方法numArr，首先键盘录入六个红球号码和一个蓝球号码，
    // 红球号码通过循环录入，将录入的数字存入数组numArr中，在录入时需要判断号码范围以及是否重复，
    //判断重复的代码因为多处会用到，因此单独放到一个方法中
    public static int[] getNumArr() {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[7];
        for (int i = 1; i < 7; i++) {
            System.out.println("请输入红球抽奖号码" + i + "：");
            int numRed = sc.nextInt();
            //将判断范围放在前面，判断重复放在后面
            //如果用户输入0，应该报范围错误，但是如果判断重复在前则会报重复错误
            if (numRed >= 1 && numRed <= 33) {
                if (checkRepeat(numArr, numRed)) {
                    numArr[i - 1] = numRed;
                } else {
                    System.out.println("号码已存在，请输入新号码");
                    i--;
                }
            } else {
                System.out.println("请输入范围1~33的抽奖号码！");
                i--;
            }
        }
        while (true) {
            System.out.println("请输入蓝球抽奖号码：");
            int numBlue = sc.nextInt();
            if (numBlue >= 1 && numBlue <= 16) {
                numArr[6] = numBlue;
                break;
            } else {
                System.out.println("请输入范围0~16的 抽奖号码！");
            }
        }
        return numArr;
    }

    //2.定义boolean类型方法checkRepeat用于检测输入的数组元素是否与已有元素重复
    // 这里不能单纯的判断if(arr[i] == num) 然后return false，这样只会遍历第一个arr[0]
    //所以定义一个count用于计数，如果输入数字在数组中已存在则count++
    //返回true则说明没有重复，返回false则说明有重复
    public static boolean checkRepeat(int[] arr,int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }

    //3.随机生成七位数中奖号码存入数组priceArr中，前六位是红球，第七位是蓝球，且红球中奖号码不能重复
    //此方法返回中奖号码数组
    public static int[] getPriceNumber(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            int num = r.nextInt(33) + 1;
            if (checkRepeat(arr, num)) {
                arr[i] = num;
            } else {
                i--;
            }
        }
        int number = r.nextInt(16) + 1;
        arr[6] = number;
        return arr;
    }

    //5.定义方法用于判定中多少钱
    public static void money(int count1, int count2) {
        if (count1 == 6 && count2 == 1) {
            System.out.println("中1000万元");
        } else if (count1 == 6 && count2 == 0) {
            System.out.println("中500万元");
        } else if (count1 == 5 && count2 == 1) {
            System.out.println("中3000元");
        } else if ((count1 == 5 && count2 == 0) || (count1 == 4 && count2 == 1)) {
            System.out.println("中200元");
        } else if ((count1 == 4 && count2 == 0) || (count1 == 3 && count2 == 1)) {
            System.out.println("中10元");
        } else if ((count1 == 2 && count2 == 1) || (count1 == 1 && count2 == 1) || (count1 == 0 && count2 == 1)) {
            System.out.println("中5元");
        } else {
            System.out.println("你没中奖");
        }
    }
}
