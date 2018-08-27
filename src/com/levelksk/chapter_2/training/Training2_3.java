package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入英尺数: ");
        double feet = input.nextDouble();
        System.out.println(feet + " 英尺数转换成米数是 " + feet * 0.305);
    }
}
