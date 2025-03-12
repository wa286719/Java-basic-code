package com.itheima.homework.homework1;

public class Phone {
    /*
    定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
    请定义出手机类，类中要有空参、有参构造方法，set/get方法。
     */
    //定义属性
    private String brand;
    private int price;
    private String color;
    //无参构造方法
    public Phone() {}
    //有参构造方法
    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    //定义set方法
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //定义get方法
    public String getBrand() {
        return brand;
    }
    public int getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    //定义call方法
    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "打电话");
    }
    //定义sendMessage方法
    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "发短信");
    }


}
