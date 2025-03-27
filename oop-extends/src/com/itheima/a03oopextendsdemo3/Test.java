package com.itheima.a03oopextendsdemo3;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();

        OverseasStudents o = new OverseasStudents();
        o.lunch();
    }
}

//这里的类不能放在main方法中，因为main方法是静态，非静态类只能被该类的非静态方法访问
class Person {
    public void eat() {
        System.out.println("吃米饭，吃菜");
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class Student extends Person {
    public void lunch() {
        eat();
        drink();
    }
}

class OverseasStudents extends Person {
    //因为父类的方法不能满足子类的需求，所以子类重写父类的方法
    //加上@Override，要保证方法名相同
    public void lunch() {
        eat();
        drink();
    }

    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }

    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}
