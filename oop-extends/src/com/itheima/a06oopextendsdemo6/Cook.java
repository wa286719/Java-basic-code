package com.itheima.a06oopextendsdemo6;

public class Cook extends Empolyee {
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }
}
