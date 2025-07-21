package com.bootcamp.Example;

import java.util.ArrayList;

public class TypeSystem {
    public static void main(String[] args){
        String studentName = "Gabriel";
        Integer studentAge = 18;
        Double acountBalance = 45.72;

        // The following line will produce a COMPILE ERROR.
        // The program will not run. This is a good thing.
        // studentAge = "twenty-one"; // Error: Incompatible types.

        System.out.println(
                "Name: " + studentName +
                ", Age: " + studentAge +
                ", Balance: " + acountBalance
        );

        var studentName2 = "Alex";
        var studentAge2 = 21;
        var accountbalance2 = 42.3;
        var registeredCourses = new ArrayList<String>();

        System.out.printf("The class of the studentName is: " + studentName2.getClass().getSimpleName());

        final Double PI = 3.14159;
        // a "final" variable can not be reassigned, it is like a const in JS

        int dayOfTheWeek = 4;
        String dayType = switch (dayOfTheWeek) {
            case 1,2,3,4,5 -> "WeekDay";
            case 6,7 -> "Weekend";
            default -> "Invalid day!";
        };
        System.out.println(dayType);
    }
}


