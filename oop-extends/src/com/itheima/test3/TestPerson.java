package com.itheima.test3;

public class TestPerson {
    public static void main(String[] args) {
        Worker w = new Worker("zhangsan",'男',25,"中国","中建八局",3);
        w.work();
        System.out.println(w.getName() + ", " + w.getAge() + ", " + w.getGender() + ", " + w.getNationality() + ", " + w.getUnit() + ", " + w.getWorkAge());

        Student s = new Student("lisi",'男',23,"德国","大西瓜大学","001");
        s.work();
        System.out.println(s.getName() + "," + s.getAge() + "就读于" + s.getSchool());

        StudentLeader sl = new StudentLeader();
        sl.work();
        sl.meeting();
    }
}
