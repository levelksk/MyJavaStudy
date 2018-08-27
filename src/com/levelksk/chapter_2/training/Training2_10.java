package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入水的重量：");
        double amountOfWater = in.nextDouble();
        System.out.println("请输入水的初始温度：");
        double initialTemperature = in.nextDouble();
        System.out.println("请输入水的最终温度：");
        double finalTemperature = in.nextDouble();
        double q = amountOfWater * (finalTemperature - initialTemperature) * 4184;
        System.out.println("能量需要：" + q);
    }
}
