package com.itheima.test8;

public class Test {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。
        要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
         */

        //1.定义一个长度为3的数组
        Student[] arr = new Student[3];
        //2.存储学生对象
        Student stu1 = new Student(1, "zhangsan", 21);
        Student stu2 = new Student(2, "lisi", 22);
        Student stu3 = new Student(3, "wangwu", 23);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //3.再添加一个学生对象
        Student stu4 = new Student(4, "zhaoliu", 24);

        //4.调用方法进行学号唯一性判断
        //已存在 -- 不用添加
        //不存在 -- 就把学生对象添加到数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //已存在 -- 不用添加
            System.out.println("输入重复学号，请重新输入");
        } else {
            //将学生添加进数组
            //创建方法判断原数组中有几个元素
            //原数组未存满 -- 直接添加
            //原数组已存满 -- 创建一个新的数组，长度为原数组长度 + 1
            int count = getCount(arr);
            //原数组未存满 -- 直接添加
            if (count != arr.length) {
                arr[count] = stu4;
                //遍历数组
                printArr(arr);
            } else {
                //原数组已存满 -- 创建一个新的数组，长度为原数组长度 + 1
                //定义方法用于创建新数组
                Student[] newArr = createNewArrs(arr);
                //将数据存入

                newArr[count] = stu4;
                //遍历数组
                printArr(newArr);
            }
        }
        //要求3：通过id删除学生信息
        //首先要找到此id对应的对象在数组中索引
        int index1 = getIndex(arr,2);
        //如果存在，则删除，如果不存在，则提示删除失败。
        if (index1 != -1) {
            //如何删除对象？直接将数组中对应索引置为null
            arr[index1] = null;
            //要求4：删除完毕之后，遍历所有学生信息。
            printArr(arr);
        } else {
            System.out.println("当前id不存在，请重新输入");
        }

        //要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
        int index2 = getIndex(arr,3);
        if (index2 != -1) {
            Student stu = arr[index2];
            int newAge = stu.getAge() + 1; //获取id对应年龄并+1
            stu.setAge(newAge); //设置新的年龄
            printArr(arr);
        } else {
            System.out.println("此id不存在，修改失败");
        }
    }




    //找到此id对应的对象在数组中索引
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) { //先判断对象是否为空，如果不为空再继续进行
                int sid = stu.getId();
                if (sid == id) { //判断stu的id是否与要查找id相同，若相同则返回索引
                    return i;
                }
            }
        }
        return -1;
    }

    //遍历数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
        }
    }

    //创建一个新的数组，长度为原数组长度 + 1
    public static Student[] createNewArrs(Student[] arr) {
        Student[] newArrs = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArrs[i] = arr[i];
        }
        return newArrs;
    }

    public static int getCount(Student[] arr) {
        //数组中未没有存放元素的索引对应null
        //直接遍历数组判断是否为空就行
        //定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                count++;
            }
        }
        return count;
    }

    //定义方法进行学号的唯一性判断。
    //要什么参数？数组和id
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }
}
