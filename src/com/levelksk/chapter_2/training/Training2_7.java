package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入分钟数: ");
        int minutes = in.nextInt();
        int days = minutes / 60 / 24;
        int years = days / 365;
        System.out.println(minutes + "分钟代表" + years + "年加上" + (days % 365)+ "天");
    }
}
