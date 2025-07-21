package com.bootcamp.model;

public record CryptoCurrencyRecord(String name, String ticker, Double price, Long marketCap) {

    public CryptoCurrencyRecord {
        if (price != null && price < 0){
            // Throwing an exception is the standard way to handle invalid constructor arguments.
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }
}