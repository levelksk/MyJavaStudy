package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的每月存款金额：");
        double amount = in.nextDouble();
        double rateOfMonth = 1 + 0.00417;
        double totalOfMonth1 = amount * rateOfMonth;
        double totalOfMonth2 = (amount + totalOfMonth1) * rateOfMonth;
        double totalOfMonth3 = (amount + totalOfMonth2) * rateOfMonth;
        double totalOfMonth4 = (amount + totalOfMonth3) * rateOfMonth;
        double totalOfMonth5 = (amount + totalOfMonth4) * rateOfMonth;
        double totalOfMonth6 = (amount + totalOfMonth5) * rateOfMonth;
        System.out.println("6个月后账上余额为：" + totalOfMonth6);
    }
}
