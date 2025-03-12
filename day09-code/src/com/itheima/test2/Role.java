package com.itheima.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    //定义数组来存储长相
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};


    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //直接调用setFace方法
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    //这里传递的参数是gender
    public void setFace(char gender) {
        //从长相数组中随机取出长相
        Random r = new Random();
        //判断男女，分别从不同的数组中取出长相
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }

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

    public void showRoleInfo() {
        System.out.println("姓名为：" + this.getName());
        System.out.println("血量为：" + this.getBlood());
        System.out.println("性别为：" + this.getGender());
        System.out.println("长相为：" + this.getFace());
    }

    //现在定义一个攻击方法attack
    //谁攻击谁？
    //定义角色时，
    // Role r1 = new Role()
    // Role r2 = new Role()
    //r1攻击了r2，则就是r1调用了attack方法，参数是r2

    public void attack(Role role) {
        //实现什么样的效果？
        //乔峰怎么样打了鸠摩智，根据剩余血量来判断鸠摩智收到了什么样的伤害
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        System.out.printf(KungFu,this.getName(),role.getName());
        System.out.println();

        //造成的伤害定义为一个1~20的随机数
        int hurt = r.nextInt(20) + 1;
        //剩余血量用新的变量remainingBlood表示
        int remainingBlood = role.getBlood() - hurt;
        //再判断剩余血量是否为负值，如果为负值就将其置为0
        remainingBlood = remainingBlood < 0 ? 0 : remainingBlood;
        role.setBlood(remainingBlood);

        //根据剩余血量来判断鸠摩智收到了什么样的伤害
        //血量 > 90  0索引
        //80~90 1索引
        //70~80 2索引
        //60~70 3索引
        //40~60 4索引
        //20~40 5索引
        //10~20 6索引
        //0~10 7索引
        if (remainingBlood > 90) {
            System.out.printf(injureds_desc[0],role.getName());
        } else if(remainingBlood > 80) {
            System.out.printf(injureds_desc[1],role.getName());
        } else if(remainingBlood > 70) {
            System.out.printf(injureds_desc[2],role.getName());
        } else if(remainingBlood > 60) {
            System.out.printf(injureds_desc[3],role.getName());
        } else if(remainingBlood > 40) {
            System.out.printf(injureds_desc[4],role.getName());
        } else if(remainingBlood > 20) {
            System.out.printf(injureds_desc[5],role.getName());
        } else if(remainingBlood > 10) {
            System.out.printf(injureds_desc[6],role.getName());
        } else if(remainingBlood > 0) {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();

        //攻击者就是方法的调用者，用this关键字点出，被攻击者是参数
    }

}
