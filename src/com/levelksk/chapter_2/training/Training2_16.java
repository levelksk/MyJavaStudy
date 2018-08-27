package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入6边型的边长：");
        double s = in.nextDouble();
        double area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(s, 2);
        System.out.println("6边型的面试是：" + area);
    }
}