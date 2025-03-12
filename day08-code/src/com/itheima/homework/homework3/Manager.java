package com.itheima.homework.homework3;

public class Manager {
    /*
    属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
    工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
     */
    private String name;
    private int id;
    private int salary;
    private int bonus;

    //有参和无参构造
    public Manager() {}
    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    //set和get方法
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public int getBonus() {
        return bonus;
    }

    //work方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的项目经理" + name + "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }


}
