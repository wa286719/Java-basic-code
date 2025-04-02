package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String CHANGE_STUDENT = "3";
    private static final String SEARCH_STUDENT = "4";
    private static final String EXIT = "5";
    public static void main() {
        //！！！！！！！！！！！！！！
        //项目注意点，在主方法中使用while(true)循环，其内使用switch根据不同输入调用不同方法
        //每个独立的方法不需要再返回到start menu，因为在主方法中的循环里就在不断调用start menu
        //！！！！！！！！！！！！！！
        //退出的方法有两种，
        //一：给循环起个名字，loop:while(true)，在对应循环中写 break loop;停止指定的循环
        //二：System.exit(0);直接停止Java虚拟机的运行，相当于直接关闭程序
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            //switch新特性
            switch (startMenu()) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case CHANGE_STUDENT -> changeStudent(list);
                case SEARCH_STUDENT -> searchStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("输入错误，请重新输入");
                //用不着startMenu();
            }
            /*switch (startMenu()) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    changeStudent(list);
                    break;
                case "4":
                    searchStudent(list);
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    startMenu();
                    break;
            }*/
        }

    }
    //开始菜单
    public static String startMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------欢迎来到黑马学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择:");
        //这里使用sc.next更好一些，如果用nextInt的话用户输入非数字就会报错
        //使用next容错率更高，就算输入错了在switch里做一个default就可以
        return sc.next();
    }
    //获取对应id的索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }
    //检查id是否存在
    public static boolean checkId(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return true;
            }
        }
        return false;
    }
    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        /*
        键盘录入每一个学生信息并添加，需要满足以下要求：
        * id唯一
         */
        Scanner sc = new Scanner(System.in);
        //这里需要定义一个Id用于传递循环内的id值
        //或者调用stu.setId方法也可以
        String Id = "";
        //调用检查id方法来检查id是否重复
        while (true) {
            System.out.println("请输入学生id：");
            String id = sc.next();
            if (!checkId(list, id)) {
                Id += id;
                break;
            }
            System.out.println("输入id重复，请重新输入");
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生住址：");
        String address = sc.next();
        Student stu = new Student(Id, name, age, address);
        list.add(stu);
        System.out.println("添加成功！");
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        /*
        键盘录入要删除的学生id，需要满足以下要求：
        * id存在删除
        * id不存在，需要提示不存在，并回到初始菜单
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id：");
        String id = sc.next();
        //checkId如果存在则返回true，不存在返回false
        if (checkId(list, id)) {
            list.remove(getIndex(list, id));
            System.out.println("删除成功");
            //这里怎么提示不存在？
            //直接用return，可以退出方法
            return;
        }
        System.out.println("该id不存在");
    }
    //修改学生
    public static void changeStudent(ArrayList<Student> list) {
        /*
        键盘录入要修改的学生id，需要满足以下要求
        * id存在，继续录入其他信息
        * id不存在，需要提示不存在，并回到初始菜单
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生id：");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                System.out.println("请输入新的id");
                String newId = sc.next();
                checkId(list, newId);
                list.get(i).setId(newId);
                System.out.println("请输入新的姓名");
                String newName = sc.next();
                list.get(i).setName(newName);
                System.out.println("请输入新的年龄");
                int newAge = sc.nextInt();
                list.get(i).setAge(newAge);
                System.out.println("请输入新的住址");
                String newAddress = sc.next();
                list.get(i).setAddress(newAddress);
                return;
            }
        }
        System.out.println("该id不存在！");

    }
    //查询学生
    public static void searchStudent(ArrayList<Student> list) {
        /*
        打印所有的学生信息，需要满足以下要求
        * 如果没有学生信息，提示：当前无学生信息，请添加后再查询
        * 如果有学生信息，需要按照以下格式输出。（不用过于纠结对齐的问题）
         */
        if (list == null || list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
        } else {
            System.out.println("id" + "        " + "姓名" + "        " + "年龄" + "        " + "住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId() + "        " + list.get(i).getName() + "        " + list.get(i).getAge() + "        " + list.get(i).getAddress());
            }
        }
    }
}