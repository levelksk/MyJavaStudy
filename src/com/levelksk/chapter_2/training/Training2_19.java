package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三角形三个点的坐标： ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double s1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double s2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double s3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double s = (s1 + s2 +s3) / 2;
        double area = Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);
        System.out.println("三角形的面积是： " + area);
    }
}
