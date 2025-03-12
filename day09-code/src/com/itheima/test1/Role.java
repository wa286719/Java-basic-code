package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public int getBlood() {
        return blood;
    }

    //现在定义一个攻击方法attack
    //谁攻击谁？
    //定义角色时，
    // Role r1 = new Role()
    // Role r2 = new Role()
    //r1攻击了r2，则就是r1调用了attack方法，参数是r2

    public void attack(Role role) {
        //造成的伤害定义为一个1~20的随机数
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //剩余血量用新的变量remainingBlood表示
        int remainingBlood = role.getBlood() - hurt;
        //再判断剩余血量是否为负值，如果为负值就将其置为0
        remainingBlood = remainingBlood < 0 ? 0 : remainingBlood;
        role.setBlood(remainingBlood);

        //攻击者就是方法的调用者，用this关键字点出，被攻击者是参数
        System.out.println(this.getName() + "攻击了" + role.getName() + "，造成了" + hurt + "点伤害，" +
                role.getName() + "还剩" + remainingBlood + "点血");
    }

}
