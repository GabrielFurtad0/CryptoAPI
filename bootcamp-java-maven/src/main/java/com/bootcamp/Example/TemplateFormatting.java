package com.bootcamp.Example;

public class TemplateFormatting {
    public static void main(String[] args){
        String user = "Gabriel";
        Integer score = 95;

        // the old way
        String oldStatus = "User: " + user + " | Score: " + score;

        // The modern way using the STR template processor
        String newStatus = STR."User: \{user} | Score: \{score}";

        // Templates can also handle expressions
        String nextLevelStatus = STR."User: \{user} | Score for the next level: \{score + 5}";

        System.out.println(newStatus);
        System.out.println(nextLevelStatus);
    }
}
