package com.itheima.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        //！！！！！！！！注意
        //如果想要返回多个数据，可以考虑将数据放在容器中
        //集合
        //如果直接输出返回的集合，只会输出其中的地址值
        //因此需要遍历这个集合，调用getBrand方法输出品牌和价格
        ArrayList<Phone> list = new ArrayList<>();
        Phone phone1 = new Phone("小米",1000);
        Phone phone2 = new Phone("苹果",8000);
        Phone phone3 = new Phone("锤子",2999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        //如果直接输出返回的集合，只会输出其中的地址值
        //因此需要遍历这个集合，调用getBrand方法输出品牌和价格
        ArrayList<Phone> result = checkPrice(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getBrand() + " " + result.get(i).getPrice());
        }
    }
    //如果想要返回多个数据，可以考虑将数据放在容器中
    //集合
    public static ArrayList<Phone> checkPrice(ArrayList<Phone> list) {
        ArrayList<Phone> result = new ArrayList<>();
        //返回价格低于3000的手机
        String brand = "";
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            if (phone.getPrice() < 3000) {
                result.add(phone);
            }
        }
        return result;
    }
}
