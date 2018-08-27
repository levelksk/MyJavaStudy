package com.levelksk.chapter_2.training;

import java.util.Scanner;

public class Training2_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入时区偏移量：");
        int timeZoneOffset = in.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight , Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours + timeZoneOffset) % 24;

        // Display results
        System.out.println("The current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond);

    }
}
