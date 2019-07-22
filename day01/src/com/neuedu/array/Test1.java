/**
 * 数组定义赋值，随机生成数字，输出最值，总和，平均值
 */
package com.neuedu.array;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[5];
        //给每一个位置随机生成数字
        //定义一个变量接收随机数组，将变量的值赋值给数组，并打印数组
        for (int i = 0; i < arr.length; i++) {
            int a = new Random().nextInt(1000);
            arr[i] = a;
            System.out.println(arr[i]+" ");
        }
        //输出最大值最小值，总和，平均值
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        //进行优化，i=1可以少循环一次
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
            if (min < arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("总和为："+sum);
        System.out.println("平均值为："+min);

    }
}
