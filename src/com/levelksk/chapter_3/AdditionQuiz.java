package com.levelksk.chapter_3;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        // Create a Scanner
        Scanner in = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");

        int answer = in.nextInt();

        System.out.println(
                number1 + " + " + number2 + " = " + answer + " is " +
                        (number1 + number2 == answer));
    }
}
