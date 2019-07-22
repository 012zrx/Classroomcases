/**
 * 定义猫的属性和行为
 */

package com.neuedu.CatDemo;

public class Cat {

    //定义属性
    String name;
    int age;
    String color;
    int weight;

    //构造方法
    public Cat() {

    }
    //构造方法重载,只看参数列表
    public Cat(String color1) {
        color = color1;
    }

    //定义行为
    //叫
    void jiao() {
        System.out.println("喵喵喵");
    }
    //捉老鼠
    void zhuo() {
    }
}
