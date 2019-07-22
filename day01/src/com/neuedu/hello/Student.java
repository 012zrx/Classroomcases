
/**
 * 学生管理系统主菜单界面
 */

package com.neuedu.hello;

import java.util.Scanner;

public class Student {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();
    }
    static void showMenu() {
        while (true) {
            System.out.println("===============================");
            System.out.println("  " + "主" + "  " + "菜" + "  " + "单");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.帮助信息");
            System.out.println("===============================");

            //键盘输入选项
            int index = input.nextInt();
            input.nextLine();
            switch (index) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}

