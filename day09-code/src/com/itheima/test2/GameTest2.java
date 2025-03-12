package com.itheima.test2;

public class GameTest2 {
    public static void main(String[] args) {
        Role2 role1 = new Role2("乔峰", 100, '男');
        Role2 role2 = new Role2("鸠摩智", 100, '男');
        role1.showRoleIfo();
        role2.showRoleIfo();
        //用循环模拟回合制战斗，结束条件是有一方血量为0
        while (true) {
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role1.getName() + "KO了" + role2.getName());
                break;
            }
            role2.attack(role1);
            if (role1.getBlood() == 0) {
                System.out.println(role2.getName() + "KO了" + role1.getName());
                break;
            }
        }
    }
}
