package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int digits = input.nextInt();
        int digit1 = digits / 100;
        int digit3 = digits % 10;
        if (digit1 == digit3) {
            System.out.println(digits + " is a palindrome");
        }
        else {
            System.out.println(digits + " is not a palindrome");
        }
    }
}
