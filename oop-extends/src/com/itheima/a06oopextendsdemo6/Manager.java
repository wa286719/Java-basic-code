package com.itheima.a06oopextendsdemo6;

public class Manager extends Empolyee {
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    //父类中的get和set方法可以直接继承，所以不需要再写

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理在管理他人");
    }
}
