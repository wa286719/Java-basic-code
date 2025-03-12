package com.itheima.homework.homework4;

public class Cat {
    /*
    属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
     */

    //属性
    private String color;
    private String breed;

    //有参和无参构造方法
    public Cat() {}
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    //set和get方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //eat()和catchMouse()方法
    /*
    花色的波斯猫正在吃鱼.....
    花色的波斯猫正在逮老鼠....
     */
    public void eat() {
        System.out.println(color + "的" + breed + "正在吃鱼.....");
    }

    public void catchMouse() {
        System.out.println(color + "的" + breed + "正在逮老鼠.....");
    }
}
