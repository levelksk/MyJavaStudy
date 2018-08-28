package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();
        int d1 = digits / 100000000;
        int d2 = digits / 10000000 % 10;
        int d3 = digits / 1000000 % 10;
        int d4 = digits / 100000 % 10;
        int d5 = digits / 10000 % 10;
        int d6 = digits / 1000 % 10;
        int d7 = digits / 100 % 10;
        int d8 = digits / 10 % 10;
        int d9 = digits % 10;
        int number10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println("The ISBN-10 number is " + digits + (number10 == 10 ? "X" : number10));
    }
}
