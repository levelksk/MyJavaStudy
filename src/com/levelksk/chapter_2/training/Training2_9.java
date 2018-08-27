package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入起始速度，终止速度，时间段（秒单位）：");
        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();
        System.out.println("平均加速度是：" + ((v1 - v0) / t) + "米每秒");
    }
}
