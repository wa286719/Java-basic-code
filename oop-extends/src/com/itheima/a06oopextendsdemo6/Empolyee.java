package com.itheima.a06oopextendsdemo6;

public class Empolyee {
    private String id;
    private String name;
    private double salary;

    public Empolyee() {
    }

    public Empolyee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void eat() {
        System.out.println("吃米饭");
    }

    public void work() {
        System.out.println("员工在工作");
    }
}
