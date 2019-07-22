/**
 * 鸡兔同笼
 */
package com.neuedu.hello;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {

        System.out.println("请输入头的个数");
        Scanner scanner = new Scanner(System.in);
        int head = scanner.nextInt();
        System.out.println("请输入脚的个数");
        int foot = scanner.nextInt();

        if (head > 0 && foot > 0 && (foot >= 2*head) && (foot <= 4*head) && foot % 2 ==0){

        //x:鸡
        int x;
        //y:兔子
        int y = 0;
        for (x = 0;x < head;x++) {
            y = head - x;
            if ((2 * x + 4 * y) == foot) {
                System.out.println(x + "只鸡");
                System.out.println(y + "只兔子");
            }
        }
        }else {
            System.out.println("输入错误");
        }


    }
}
