package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double judge = Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5);
        if (judge > 0) {
            double root1 = (-b + judge) / (2 * a);
            double root2 = (-b - judge) / (2 * a);
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        }
        else if (judge == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root " + root);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
