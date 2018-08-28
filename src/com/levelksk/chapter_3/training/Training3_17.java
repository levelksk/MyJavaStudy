package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("scissor(0), rock(1), paper(2): ");
        int you = input.nextInt();
        int computer = (int)(Math.random() * 100);
        if (computer < 33)
            computer = 0;
        else if (computer < 66)
            computer = 1;
        else
            computer = 2;
        if (you == 0) {
            if (computer == 0) {
                System.out.println("The computer is scissor. Your are scissor too. It is a draw");
            }
            else if (computer == 1) {
                System.out.println("The computer is rock. Your are scissor. Computer won");
            }
            else
                System.out.println("The computer is paper. Your are scissor. You won");
        }
        else if (you == 1) {
            if (computer == 0) {
                System.out.println("The computer is scissor. Your are rock. You won");
            }
            else if (computer == 1) {
                System.out.println("The computer is rock. Your are rock too. It is a draw");
            }
            else
                System.out.println("The computer is paper. Your are rock. Computer won");
        }
        else {
            if (computer == 0) {
                System.out.println("The computer is scissor. Your are paper. Computer won");
            }
            else if (computer == 1) {
                System.out.println("The computer is rock. Your are paper. You won");
            }
            else
                System.out.println("The computer is paper. Your are paper too. It is a draw");
        }
    }
}
