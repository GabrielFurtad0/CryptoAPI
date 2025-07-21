package com.bootcamp;


import java.util.List;
import java.util.ArrayList;

import com.bootcamp.model.CryptoCurrency;
import com.bootcamp.model.FinancialAsset;
import com.bootcamp.model.Stock;

public class PortfolioManager {

    public static void main(String[] args) {

        List<FinancialAsset> financialPortfolio = new ArrayList<>();

        financialPortfolio.add( new CryptoCurrency("Bitcoin", "BTC", 66000.0, 1_300_000_000_000L));
        financialPortfolio.add( new Stock("NVIDIA Corp", "NVDA", 120.0, "NASDAQ"));
        financialPortfolio.add( new CryptoCurrency("Solana", "SOL", 165.0, 76_000_000_000L));
        financialPortfolio.add( new Stock("Microsoft", "MSFT", 445.0, "NASDAQ"));

        System.out.println(STR."---Financial Portfolio ---");
        for(FinancialAsset asset : financialPortfolio) {
            asset.displayInfo();
        }

        // Acessing the first index
        FinancialAsset firstAsset = financialPortfolio.getFirst();
        System.out.println(STR."\nFirst asset: ");
        firstAsset.displayInfo();

        // Removing an item
        financialPortfolio.remove(2);

        // Displaying the modified financial portfolio
        System.out.println(STR."--- Final Financial Portfolio ---");
        for(FinancialAsset asset : financialPortfolio) {
            asset.displayInfo();
        }

    }
}
