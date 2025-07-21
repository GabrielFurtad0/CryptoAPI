package com.bootcamp.crypto.service;

import com.bootcamp.crypto.model.PriceData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class ApiService {

    private final HttpClient client = HttpClient.newHttpClient();
    private final ObjectMapper mapper = new ObjectMapper();
    private static final String API_BASE_URL = "https://api.coingecko.com/api/v3/simple/price";

    public Map<String, PriceData> getPrices(List<String> coinIds) throws Exception {
        // 1. Build the URL dynamically from the list of coin IDs.
        String ids = String.join(",", coinIds);
        String url = STR."\{API_BASE_URL}?ids=\{ids}&vs_currencies=usd";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // 2. Send the request.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            // In a real app, you'd have more sophisticated error handling.
            throw new RuntimeException(STR."Failed with status code: \{response.statusCode()}");
        }

        // 3. Parse the JSON into a Map instead of a specific record.
        return mapper.readValue(response.body(), new TypeReference<Map<String, PriceData>>() {});
    }
}
