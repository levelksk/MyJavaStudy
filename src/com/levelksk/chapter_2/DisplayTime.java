package com.levelksk.chapter_2;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        // Prompt the user for input
//        System.out.print("Enter an integer for seconds: ");
//        int seconds = input.nextInt();
//
//        int minutes = seconds / 60; // Find minutes in seconds
//        int remainingSeconds = seconds % 60; // Seconds remaining
//        System.out.println(seconds + " seconds is " + minutes +
//                " minutes and " + remainingSeconds + " secondes");
        int a = 6;
        int b = a++;
        System.out.println(a); // 7
        System.out.println(b); // 6
        a = 6;
        b = ++a;
        System.out.println(a); // 7
        System.out.println(b); // 7
    }
}
