/**
 * 定义方法类
 */
package com.neuedu.Point;

public class Point {
    //1.可以生成具有特定坐标的点对象
    double x;
    double y;

    public Point(double x1,double y1) {
        //要求具有特定坐标
        x = x1;
        y = y1;
    }
    //2.提供可以设置坐标的方法
    //提供一个方法，设置x，y变量的值，不需要返回值，只是要赋值，
    // 需要参数，用来说明将x设置为什么
    public void setX(double x1) {
        x = x1;
    }

    public void setY(double y1) {
        y = y1;
    }
    //定义计算两点距离的方法
    public double distance(Point point) {
        double result = 0.0;
        //计算幂次方的Math函数
        result = Math.pow(point.x - x,2) + Math.pow(point.y - y,2);
        //计算开放的Math函数
        result = Math.sqrt(result);
        //返回结果
        return result;
    }
}
