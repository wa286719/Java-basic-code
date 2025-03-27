package com.itheima.a07oopextendsdemo7;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work() {
        System.out.println("Maintainer在工作");
    }
}
