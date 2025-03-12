package com.itheima.homework.homework3;

public class Coder {
    /*
    属性：姓名name，工号id，工资salary。行为：工作work()
    工号为135基本工资为10000的程序员李四正在努力的写着代码......
     */

    //属性
    private String name;
    private int id;
    private int salary;

    //有参和无参构造
    public Coder() {}
    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //定义work方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员" + name + "正在努力的写着代码......");
    }
}
