package com.bootcamp.Example;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args) {
        // Best Practice: Declare the variable with the interface type (List)...
        // ...and instantiate it with a specific implementation class (ArrayList).
        List<String> cryptoTickers = new ArrayList<>();

        // 1. Populating the list
        cryptoTickers.add("BTC");
        cryptoTickers.add("ETH");
        cryptoTickers.add("SOL");
        cryptoTickers.add("ETH"); // Duplicates are allowed in a List

        System.out.println(STR."The list contais: \{cryptoTickers}");

        // 2. Getting the size
        System.out.println(STR."The number of elements is: \{cryptoTickers.size()}");

        // 3. Getting the element by its index
        String secondTicker = cryptoTickers.get(1);
        System.out.println(STR."The element at index 1 is: \{secondTicker}");

        // 4. Modifying an element at a specific index
        cryptoTickers.set(1, "Ethereum");
        System.out.println(STR."List after modification: \{cryptoTickers}");

        // 5. Removing an element by its index
        cryptoTickers.remove(2);
        System.out.println(STR."List after removal: \{cryptoTickers}");

        // 6. Checking if an element exists
        Boolean hasSolana = cryptoTickers.contains("SOL");
        System.out.println(STR."Does the list contain SOL? \{hasSolana}");

        // 7. Iterating through the list
        System.out.println("\n--- Portfolio Tickers ---");
        for (String ticker : cryptoTickers) {
            System.out.println(ticker);
        }
    }
}
