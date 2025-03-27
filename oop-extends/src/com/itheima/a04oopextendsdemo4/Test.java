package com.itheima.a04oopextendsdemo4;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
        Sharpei s = new Sharpei();
        s.eat();
        s.drink();
        s.lookHome();
        ChineseDog c = new ChineseDog();
        c.eat();
        c.drink();
        c.lookHome();
    }

}

class Dog {
    public void eat() {
        System.out.println("吃狗粮");
    }

    public void drink() {
        System.out.println("喝水");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}

class Husky extends Dog {
    public void breakHome() {
        System.out.println("拆家");
    }
}

class Sharpei extends Dog {
    @Override
    public void eat() {
        //可以直接调用父类中的eat方法实现吃狗粮，只需要额外添加吃骨头的代码即可
        super.eat();
        System.out.println("沙皮狗吃骨头");
    }
}

class ChineseDog extends Dog {
    @Override
    public void eat() {
        System.out.println("中华田园犬吃剩饭");
    }
}
