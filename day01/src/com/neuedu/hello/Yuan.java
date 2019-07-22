/**
 * 计算圆的周长和面积
 */

package com.neuedu.hello;

import java.util.Scanner;

public class Yuan {

    static Scanner input = new  Scanner(System.in);

    public static void main(String[] args) {
        count();
    }

    static void count() {
        System.out.println("请输入半径");
        int radius = input.nextInt();
        input.nextLine();

        if (radius > 0) {
            //计算周长
            double girth = radius * 2 * 3.14;
            //计算面积
            double area = radius * radius * 3.14;
            System.out.println("周长为：" + girth);
            System.out.println("面积为：" + area);
        }else {
            System.out.println("半径长度输入不合法");
        }
    }
}
