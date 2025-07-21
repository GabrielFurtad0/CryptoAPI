package com.bootcamp.Example;

public class TextFormatting {
    public static void main(String[] args){

        // The old, unreadable way
        String oldMessage = "{\n" +
                "  \"userId\": \"john.doe\",\n" +
                "  \"status\": \"ACTIVE\"\n" +
                "}";

        System.out.println(oldMessage);
        String jsonPayload = """
                {
                    "userID": "John Doe",
                    "status": "Active",
                }
                """;

        System.out.println(jsonPayload);
    }
}
