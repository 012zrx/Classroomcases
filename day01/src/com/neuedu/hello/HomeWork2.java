/**
 * 使用for循环打印斐波那契数列(1000以内)
 */

package com.neuedu.hello;
public class HomeWork2 {
    public static void main(String[] args) {

        int a = 1,b = 1;
        while (a < 1000||b < 1000){
            System.out.print(a + " " + b + " ");
            a = a + b;
            b = a + b;
        }


    }
}
