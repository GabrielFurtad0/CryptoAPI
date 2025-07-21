package com.bootcamp.Example;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> uniqueTickers = new HashSet<>();

        uniqueTickers.add("BTC");
        uniqueTickers.add("ETH");
        uniqueTickers.add("SOL");
        System.out.println(STR."Set after initial adds \{uniqueTickers}");

        // Trying to add a duplicate element
        boolean wasAdded = uniqueTickers.add("BTC");

        System.out.println(STR."\nWas the sencond 'BTC' Added? \{wasAdded}");

        boolean hasSolana = uniqueTickers.contains("SOL");
        System.out.println(STR."Does the set contain SOL? \{hasSolana}");

        uniqueTickers.remove("ETH");
        System.out.println(STR."Set after removing ETH: \{uniqueTickers}");
    }
}
