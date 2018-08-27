package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入年数：");
        int years = in.nextInt();
        System.out.println(312032486 + (years * 365 * 24 * 60 * 60 / 7) - (years * 365 * 24 * 60 * 60 / 13) + (years * 365 * 24 * 60 * 60 / 45));
    }
}
