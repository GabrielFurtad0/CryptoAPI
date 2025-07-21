package com.bootcamp.service;

import com.bootcamp.model.CryptoCurrency;
import com.bootcamp.model.FinancialAsset;
import com.bootcamp.model.Stock;

import java.util.HashMap;
import java.util.Map;

public class IndexedPortfolio {
    public static void main(String[] args) {

        Map<String, FinancialAsset> indexedPortfolio = new HashMap<>();

        indexedPortfolio.put("SOL", new CryptoCurrency("Solana", "SOL", 165.0, 76_000_000_000L));
        indexedPortfolio.put("BTC", new CryptoCurrency("Bitcoin", "BTC", 66000.0, 1_300_000_000_000L));
        indexedPortfolio.put("MSFT", new Stock("Microsoft", "MSFT", 445.0, "NASDAQ"));
        indexedPortfolio.put("LTDCP", new Stock("Leitura Descomplicada", "LTDCP", 25.2, "Ibovespa"));

        FinancialAsset bestStock = indexedPortfolio.get("LTDCP");
        System.out.println(STR."\nThe best stock in world history is:");
        bestStock.displayInfo();

        indexedPortfolio.remove("MSFT");

        for (String ticker : indexedPortfolio.keySet()) {
            FinancialAsset asset = indexedPortfolio.get(ticker);
            System.out.println(STR."Ticker: \{ticker}");
            asset.displayInfo();
        }
    }
}
