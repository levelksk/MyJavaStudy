package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入速度和加速度：");
        double speed = in.nextDouble();
        double accdleration = in.nextDouble();
        double length = Math.pow(speed, 2) / (2 * accdleration);
        System.out.println("最短跑道长度为：" + length);
    }
}
