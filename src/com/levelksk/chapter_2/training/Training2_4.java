package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入磅数: ");
        double pounds = input.nextDouble();
        System.out.println(pounds + " 英尺数转换成米数是 " + pounds * 0.305);
    }
}
