package com.itheima.test.test2;

public class GirlFriend {
    //属性
    //private关键字修饰完后就只能在本类中使用，
    // 其他类不能用
    private String name;
    private int age;
    private String gender;

    //作用：给成员变量name进行赋值
    public void setName(String name) {
        //局部变量表示测试类中调用方法传递来的数据
        //等号左边：表示成员位置的name
        this.name = name;
    }
    //作用：对外提供name属性
    public String getName() {
        return name;
    }

    //作用：给成员变量age赋值
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;
        } else {
            System.out.println("错误年龄");
        }

    }

    //对外提供成员变量age的值
    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }


}
