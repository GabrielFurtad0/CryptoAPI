package com.bootcamp.Example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // A Map works with two generic types: Map<KeyType, ValueType>
        Map<String, String > countryCapitals = new HashMap<>();

        // 1. Populating the Map with the put() method
        countryCapitals.put("Brazil", "Brasília");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("USA", "Washington, D.C");

        // 2. Updating a value with put()
        countryCapitals.put("Japan", "Kyoto");

        System.out.println(STR."\nThe map of capitals: \{countryCapitals}");
        System.out.println(STR."The number of pairs in the map is: \{countryCapitals.size()}");

        // 3. Retrieving a value using its key with get()
        String capitalOfBrazil = countryCapitals.get("Brazil");
        System.out.println(STR."The capital of Brazil is: \{capitalOfBrazil}");

        // Getting a key that does not exist returns null
        String capitalOfGermany = countryCapitals.get("Bulgaria");
        System.out.println(STR."The capital of Bulgaria is: \{capitalOfGermany}");

        // 4. Checking if a key exists
        boolean hasUSA = countryCapitals.containsKey("USA");
        System.out.println(STR."\n Does the map contain USA? \{hasUSA}");

        // 5. Removing a pair by its key
        countryCapitals.remove("USA");
        System.out.println(STR."Map after removing USA: \{countryCapitals}");

        // 6. Iterating over a Map
        System.out.println("\n--- Iterating over the map's keys ---");
        // You cannot loop over a map directly. You must get a "view" of its keys or entries.
        // The most common way is to get the set of all keys.
        for (String country : countryCapitals.keySet()) {
            // Inside the loop the key is used to get the corresponding value
            String capital = countryCapitals.get(country);
            System.out.println(STR."The Capital of \{country} is \{capital}");
        }

    }
}
