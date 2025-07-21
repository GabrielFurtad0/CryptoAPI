package com.bootcamp;

import com.bootcamp.model.CryptoCurrency;
import com.bootcamp.model.FinancialAsset;
import com.bootcamp.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<FinancialAsset> assetPortfolio = new ArrayList<>();

        assetPortfolio.add( new CryptoCurrency("Bitcoin", "BTC", 66000.0, 1_300_000_000_000L));
        assetPortfolio.add( new Stock("NVIDIA Corp", "NVDA", 120.0, "NASDAQ"));
        assetPortfolio.add( new CryptoCurrency("Solana", "SOL", 165.0, 76_000_000_000L));
        assetPortfolio.add( new Stock("Microsoft", "MSFT", 445.0, "NASDAQ"));
        assetPortfolio.add( new Stock("Leitura Descomplicada", "LTDCP", 250.2, "Ibovespa"));



        System.out.println("\n --- Assets worth more than $200.0 (for) ---");
        for (FinancialAsset asset : assetPortfolio ) {
            Double price = asset.getPrice();

            if (price >= 200.0 ) {
                asset.displayInfo();
            }
        }

        System.out.println("\n --- Assets worth more than $200.0 (Stream) ---");
        assetPortfolio.stream()
                .filter(asset -> asset.getPrice() >= 200.0 )
                .forEach(FinancialAsset::displayInfo);

    }
}
