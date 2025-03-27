package com.itheima.test3;

public class StudentLeader extends Student{
    String job;

    public StudentLeader() {
    }

    public StudentLeader(String name, char gender, int age, String nationality, String school, String stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void meeting() {
        System.out.println("开会");
    }
}
