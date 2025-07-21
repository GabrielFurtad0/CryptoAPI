package com.bootcamp.Example;

import java.util.Scanner;

public class SimpleBmiCalc {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inputReader.nextLine();

        System.out.print("Enter your height in meters: ");
        Double height = Double.parseDouble(inputReader.nextLine());

        System.out.print("Enter your weight: ");
        Double weight = Double.parseDouble(inputReader.nextLine());

        inputReader.close();

        String BMI = STR."--- BMI Calculator ---" +
                STR."User Name: \{name}" +
                STR."Your BMI is: \{weight / (height * height)}";

        String BMI2 = STR."""
                --- BMI Calculator ---
                Name: \{name}
                BMI: \{String.format("%.2f",weight / (height * height))}
                """;

        System.out.println(BMI2);

    }
}
