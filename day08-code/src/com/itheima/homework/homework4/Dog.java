package com.itheima.homework.homework4;

public class Dog {
    /*
    属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
     */

    //属性
    private String color;
    private String breed;

    //有参和无参构造方法
    public Dog() {}
    public Dog(String color, String breed) {
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

    //eat()和lookHome()方法
    /*
    黑色的藏獒正在啃骨头.....
    黑色的藏獒正在看家.....
     */
    public void eat() {
        System.out.println(color + "的" + breed + "正在啃骨头.....");
    }

    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家.....");
    }
}
