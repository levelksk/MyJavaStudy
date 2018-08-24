package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入摄氏温度,例如 37.8: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 /5 ) * celsius + 32;
        System.out.println("摄氏温度" + celsius + "转换成华氏温度为 " + fahrenheit);
    }
}
