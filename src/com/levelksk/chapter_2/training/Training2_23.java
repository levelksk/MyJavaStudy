package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入行驶的距离：");
        double distance = in.nextDouble();
        System.out.print("请输入每加仑燃油可以行使的距离：");
        double miles = in.nextDouble();
        System.out.print("请输入每加仑的价格：");
        double price = in.nextDouble();
        System.out.println("旅程的总费用是：" + distance / miles * price);
    }
}
