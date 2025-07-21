package com.bootcamp.crypto;

import com.bootcamp.crypto.model.PriceData;
import com.bootcamp.crypto.service.ApiService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class CryptoApp {
    public static void main(String[] args) {
        // 1. Define the list of coins we are interested in.
        List<String> coinsToFetch = List.of("bitcoin", "ethereum", "solana", "cardano", "dogecoin");

        // 2. Create an instance of our dedicated service.
        ApiService apiService = new ApiService();

        System.out.println(STR."Fetching prices for: \{String.join(", ", coinsToFetch)}...");

        try {
            // 3. Call the service to get the data.
            Map<String, PriceData> prices = apiService.getPrices(coinsToFetch);

            // 4. Process and display the results using a Stream (from module 3).
            System.out.println("\n--- CURRENT CRYPTOCURRENCY PRICES ---");
            prices.entrySet().stream()
                    .forEach(entry ->{
                        String coinName = entry.getKey();
                        Double price = entry.getValue().priceInUsd();
                        // Using String.format() for clean currency formatting.
                        String formattedPrice = String.format("%.2f", price);
                        System.out.println(STR."\{coinName.substring(0, 1).toUpperCase() + coinName.substring(1)}: $\{formattedPrice} USD");
                    });
        } catch (Exception e) {
            System.err.println(STR."An error occurred while fetching crypto prices: \{e.getMessage()}");
        }
    }
}
