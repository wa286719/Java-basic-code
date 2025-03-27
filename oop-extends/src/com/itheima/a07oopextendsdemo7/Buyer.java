package com.itheima.a07oopextendsdemo7;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("Buyer在工作");
    }
}
