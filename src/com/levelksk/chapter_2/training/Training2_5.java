package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_5 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("请输入费用和酬金率: ");
        double subtotal = in.nextDouble();
        double rate = in.nextDouble() / 100;
        double gratuity = subtotal * rate;
        double total = gratuity + subtotal;
        System.out.println("酬金是：" + gratuity + " 总费用是: " + total);
    }
}
