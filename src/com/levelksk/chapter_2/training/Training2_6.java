package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个0到1000之间的整数: ");
        int number = in.nextInt();
        int number_1 = number % 10;
        int number_2 = number / 10 % 10;
        int number_3 = number_2 % 10;
        int sum = number_1 + number_2 + number_3;
        System.out.println("各个数字之和为: " + sum);
    }
}
