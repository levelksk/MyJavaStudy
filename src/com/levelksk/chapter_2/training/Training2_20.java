package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入收支余额和年利率：");
        double balance = in.nextDouble();
        double rate = in.nextDouble();
        System.out.println("下月利息是：" + balance * (rate / 1200));
    }
}
