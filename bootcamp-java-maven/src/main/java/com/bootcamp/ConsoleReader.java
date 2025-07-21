package com.bootcamp;

import java.util.Scanner;

public class ConsoleReader {
    public static void main(String[] args){

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String userName = inputReader.nextLine();

        System.out.print("Enter your age: ");
        Integer userAge = inputReader.nextInt();

        System.out.println("--- User Profile ---");
        System.out.println("Username: " + userName);
        System.out.println("User age: " + userAge);

        inputReader.close();
    }
}
