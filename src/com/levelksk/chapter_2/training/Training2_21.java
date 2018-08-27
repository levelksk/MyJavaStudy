package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入投资总额：");
        double amount = in.nextDouble();
        System.out.print("请输入月利率：");
        double rate = in.nextDouble() / 100;
        System.out.print("请输入投资年数：");
        double years = in.nextDouble();
        double total = 1000 * Math.pow(1 + rate, years * 12);
        System.out.println("未来投资金额是：$" + total);
    }
}
