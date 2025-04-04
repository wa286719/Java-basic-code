package com.itheima.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组存储女朋友对象
        GirlFriend[] arr = new GirlFriend[4];

        //2.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("老马", 24, "女", "窝粑粑");
        GirlFriend gf2 = new GirlFriend("老马2号", 25, "女", "窝粑粑");
        GirlFriend gf3 = new GirlFriend("老马3号", 28, "女", "窝粑粑");
        GirlFriend gf4 = new GirlFriend("老马4号", 29, "女", "窝粑粑");

        //3.把对象添加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }

        //5.求平均值
        int avg = sum / arr.length;
        System.out.println("平均值为" + avg);

        //6.统计年龄小于平均数的女朋友数量
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getHobby());
                count++;
            }
        }
        System.out.println("数量为" + count);
    }
}
