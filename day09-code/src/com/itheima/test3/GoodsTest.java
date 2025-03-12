package com.itheima.test3;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        //这里使用类来定义数组的目的是用来存储Goods类型的对象
        Goods[] arr = new Goods[3];

        //2.创建3个商品对象
        //用Ctrl+P来查看对象的参数
        Goods g1 = new Goods("001", "小米10",5999.0, 100);
        Goods g2 = new Goods("002", "保温杯",299.0, 100);
        Goods g3 = new Goods("003", "枸杞",29.9, 100);

        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice());
        }
    }
}
