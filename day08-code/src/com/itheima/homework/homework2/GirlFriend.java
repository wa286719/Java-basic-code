package com.itheima.homework.homework2;

public class GirlFriend {
    /*
    定义一个女朋友类。
    女朋友的属性包含：姓名，身高，体重。行为包含：
    洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
     */
    private String name;
    private double height;
    private double weight;

    public  GirlFriend() {
    }

    public  GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }
    public void cook() {
        System.out.println("女朋友帮我做饭");
    }

    public void show() {
        System.out.println("我女朋友叫" + name + ",身高" + height + "厘米" + ",体重" + weight +"斤");
    }
}
