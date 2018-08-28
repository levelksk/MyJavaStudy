package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight(pound): ");
        double pound = input.nextDouble();
        double cw = 0;
        if (pound > 20)
            System.out.println("the package cannot be shipped");
        else {
            if (pound > 0 && pound <= 1)
                cw = pound * 3.5;
            else if (pound > 1 && pound <= 3)
                cw = pound * 5.5;
            else if (pound > 3 && pound <= 10)
                cw = pound * 8.5;
            else if (pound > 10 && pound <= 20)
                cw = pound * 10.5;
            System.out.println(cw);
        }

    }
}
