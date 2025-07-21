package com.bootcamp.Example;

public class UserProfile {
    public static void main(String[] args){
        String userName = "Phillip Mead";
        Integer userAge = 17;
        Boolean isSubscribed = true;
        Double userAccount = null;

        if (userAge >= 18){
            System.out.println("Welcome to the class! " + userName);
        } else {
            System.out.println("Sorry " + userName + " you are not of legal age yet =(");
        }

        if (isSubscribed){
            System.out.println("Thank you!");
        }

        if (userAccount != null){
            System.out.println("The value in your account is: " + userAccount);
        } else {
            System.out.println("This user has no registered account balance");
        }
    }
}
