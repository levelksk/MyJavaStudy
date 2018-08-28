package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_2 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
        int number3 = (int)(System.currentTimeMillis() / 100 % 10);

        // Create a Scanner
        Scanner in = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + " + " + number3 + "? ");

        int answer = in.nextInt();

        System.out.println(
                number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                        (number1 + number2 + number3 == answer));
    }
}
