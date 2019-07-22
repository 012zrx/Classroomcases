/**
 * 数据类型大转小，强制转换
 */

package com.neuedu.hello;

public class Test02 {
    public static void main(String[] args) {
        int i = 1200;
        //使用小括号填写要转换的数据类型
        //1200 - 256*n直到结果在byte表示范围内
        byte b = (byte)i;
        short s = (short)i;
        System.out.println(b);
        System.out.println(s);
    }
}
