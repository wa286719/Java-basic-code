package com.itheima.demo1;

public class Animal {
    //测试不同权限修饰符的作用范围
    //private:只能在当前类中使用
    //不写:能再当前类和同一个包中的类中使用
    //protected:当前类、同一个包中的类、不同包中的子类中都可以使用
    //public:当前类、同一个包中的类、不同包中的子类还有其他无关类中都可以使用（只要导包了）
    public String name;

    public void show() {
        System.out.println(name);
    }
}
