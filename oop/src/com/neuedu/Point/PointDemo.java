/**
 * 定义Main主函数类
 */
package com.neuedu.Point;

public class PointDemo {
    public static void main(String[] args) {
        //测试，创建两个点对象
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);

        //测试setX方法,传入两点的x坐标，重新输出距离
        p1.setX(1);
        p2.setX(1);

        System.out.println(p1.distance(p2));
    }

}
