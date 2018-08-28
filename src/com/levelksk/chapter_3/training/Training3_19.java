package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三角形的三边a，b，c：");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("输入的3边可以组成三角形");
            }
            else{
                System.out.println("输入的3边无法组成三角形");
            }
        }
        else{
            System.out.println("输入值不合法");
        }
    }
}
