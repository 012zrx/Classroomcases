/**
 * 冒泡排序，选择排序，插入排序
 */

package com.neuedu.array;

public class TestHome {
    public static void main(String[] args) {

        int[] arr = {8, 5, 9, 89, 56, 325, 28, 355, 659, 2, 6, 54};

        //冒泡排序

        /*//如果数组为空或长度小于2
        if (arr == null||arr.length <= 2){
            return;
        }
        //
        int tmp;//临时变量
        //冒泡排序共进行（数组长度-1）次
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
            System.out.println(arr[i]+" ");
        }*/

        //选择排序
        /*for (int i = 0; i < arr.length; i++) {
            //设最小值=第一个数
            int min = i;
            //从第二个数开始比较选择出最小的数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                    //将最小的数与第一位替换
                    int tmp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                }
            }
            System.out.println(arr[i]+" ");
        }*/



        //插入排序
        for (int i = 0; i < arr.length; i++) {
            //设最小值=第一个数
            int min = i;
            //从第二个数开始比较选择出最小的数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                    //将最小的数与第一位替换
                    int tmp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = tmp;
                }
            }
            System.out.println(arr[i] + " ");

            //此时arr[i]为有序数组,再定义一个无序数组
            int tmp = 0;
//            int[] arr1 = {1, 5, 69, 8, 568, 0};
            for (int j = 1; j < arr.length; j++) {
                tmp = arr[i];//将当前数插入i位
                for (int k = i - 1; k >= 0; k--) {
                    if (arr[j] > tmp) {
                        arr[j + 1] = arr[i];
                    } else {
                        break;
                    }
                }
            }
        }



































    }
}
