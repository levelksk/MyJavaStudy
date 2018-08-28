package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_14 {
    public static void main(String[] args) {
        int random = (int)(Math.random() * 10);
        if (random < 5) {
            random = 0;
        }
        else{
            random = 1;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入硬币的正反面，1代表正面，0代表反面: ");
        int guess = input.nextInt();
        System.out.println("你猜" + (guess == random ? "对了" : "错了"));
    }
}
