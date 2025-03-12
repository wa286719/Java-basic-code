package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        //分析：使用for循环100.fori，得到1-100的所有数
        //包含7、7的倍数都要pass
        //令i对10取余，再/10 对10取余，得到个位和十位，再匹配个位十位是否和7相等
        //当i % 7 == 0 时，sout i，并且continue


        int i = 1;
        for (; i <= 100; i++) {
            int gewei = i % 10;
            int shiwei = (i / 10) % 10;
            if (i % 7 == 0 || gewei == 7 || shiwei == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
