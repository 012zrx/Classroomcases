/**
 * 课上案例
 */

package com.neuedu.hello;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        //画三角形,基本思想：用空格补全矩形

        //左下
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0;j < i + 1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //左上
        /*for (int i = 0; i < 5; i++) {
            for (int j = 5; j < i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //右下
        //用+补全了矩形，逻辑占位思想
        /*for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //数学思维，一个矩形为一个二维坐标系，每个对角线都有特点，
        // 换算成坐标判断需要显示的三角形区域横纵坐标的关系
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 4){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


        //打印字母,26字母对应97~123
        //正打印(i<123)反打印   两次打印123+26-1
//        for (int i = 97; i < 148; i++) {
//            //正打印，当i<123时，强转为char
//            if (i < 123){
//                System.out.print((char) i);
//            }else {
//                //反打印，递减
//                // 举例：y对应121，i此时为123，y=244-i
//                // 所以递减输出     (字母对应数字+此时i的值)-i
//                System.out.print(244 - i);
//            }
//        }


/**
 * 鸡兔同笼
 */


//                System.out.println("请输入头的个数");
//                Scanner scanner = new Scanner(System.in);
//                int head = scanner.nextInt();
//                System.out.println("请输入脚的个数");
//                int foot = scanner.nextInt();


        //判断
        /*判断条件：
         *1.head，foot大于0
         *2.foot>=2head&&foot<=4head
         *3.foot只能是偶数   即除以2余为0
         *
         */
//                if (head > 0 && foot > 0 && (foot >= 2*head) && (foot <= 4*head) && foot % 2 ==0){
//                    //x:鸡
//                    int x;
//                    //y:兔子
//                    int y = 0;
//                    for (x = 0;x < head;x++) {
//                        y = head - x;
//                        if ((2 * x + 4 * y) == foot) {
//                            System.out.println(x + "只鸡");
//                            System.out.println(y + "只兔子");
//                        }
//                    }
//                }else {
//                    System.out.println("输入错误");
//                }
//
//
//            }
//        }
    }
}