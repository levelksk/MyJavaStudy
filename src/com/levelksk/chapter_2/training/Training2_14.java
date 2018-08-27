package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入你的体重（单位：磅）：");
        double weight = in.nextDouble() * 0.45359237;
        System.out.print("请输入你的身高（单位：英尺）：");
        double height = in.nextDouble() * 0.0254;
        System.out.println("BMI 是 " + (weight / (height * height)));
    }
}
