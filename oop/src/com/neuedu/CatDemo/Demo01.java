/**
 * 在当前案例中做Main方法类
 */
package com.neuedu.CatDemo;

public class Demo01 {
    public static void main(String[] args) {

        //创建一个猫对象,为了表示唯一，用一个变量接收
        /*Cat c = new Cat();
        //给属性赋值   .在java中是“的”的意思
        c.name = "加菲";
        c.age = 2;
        c.color = "橘黄色";
        c.weight = 10;
        //调用方法的格式
        c.jiao();
        c.zhuo();*/

        //利用构造方法传参
        Cat c = new Cat("红色");
        System.out.println(c.color);
        System.out.println(11);
        System.out.println(11);


    }

}

