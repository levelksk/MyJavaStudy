package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_2 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入圆柱体的半径: ");
        double raidus = input.nextDouble();

        System.out.print("请输入圆柱体的高: ");
        double length = input.nextDouble();
        double area = raidus * raidus * PI;
        double volume = area * length;
        System.out.println("圆柱体的面积是：" + area);
        System.out.println("圆柱体的体积是：" + volume);
    }
}
