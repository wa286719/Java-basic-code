package com.itheima.test1;

public class Teacher extends Character{
    private String apartment;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void publishForm() {
        System.out.println("老师发布问题");
    }
}
