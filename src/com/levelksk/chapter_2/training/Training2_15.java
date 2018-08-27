package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入x1 和 y1的值：");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("请输入x2 和 y2的值：");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        System.out.println("两点之间的距离是：" + distance);
    }
}