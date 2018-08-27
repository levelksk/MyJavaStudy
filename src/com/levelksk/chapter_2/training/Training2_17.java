package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入-58F和41F之间的数字：");
        double fahrenheit = in.nextDouble();
        System.out.println("请输入大于等于2的数字：");
        double speed = in.nextDouble();
        double index = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(speed, 0.16)
                + 0.4275 * fahrenheit * Math.pow(speed, 0.16);
        System.out.println("风寒温度是：" + index);
    }
}
