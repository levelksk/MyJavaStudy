package com.levelksk.chapter_3.training;

import java.util.Scanner;

public class Training3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //Prompt the user to enter feet
        System.out.print("Enter feet: ");
        double height1 = input.nextDouble();

        //Prompt the user to enter inch
        System.out.print("Enter inches: ");
        double height2 = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (height1 * 12 + height2) * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
