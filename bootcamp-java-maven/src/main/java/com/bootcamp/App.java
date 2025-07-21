package com.bootcamp;

import com.bootcamp.model.CryptoCurrency;
import com.bootcamp.model.FinancialAsset;
import com.bootcamp.model.Stock;
import com.bootcamp.service.Exportable;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){

        // Creating the bitcoin instance (CryptoCurrency object)
        CryptoCurrency bitcoin = new CryptoCurrency("Bitcoin", "BTC", 69500.00, 1_370_000_000_000L);

          // Utilizing the dot(.) to access and modify the object's fields
//        bitcoin.name = "Bitcoin";
//        bitcoin.ticker = "BTC";
//        bitcoin.price = 69500.00;
//        bitcoin.marketCap = 1_370_000_000_000L; // L suffix for Long, _ for readability.


        // Creating a second completely separate object from the same class
        CryptoCurrency ethereum = new CryptoCurrency("Ethereum", "ETH", 3530.25, 424_000_000_000L);
//        ethereum.name = "Ethereum";
//        ethereum.ticker = "ETH";
//        ethereum.price = 3530.25;
//        ethereum.marketCap = 424_000_000_000L;

        // The data of both currencies are stored in different memory locations
        System.out.println("--- Crypto Market Data ---");
        System.out.println(STR."\{bitcoin.getName()} \{bitcoin.getTicker()}: U$\{bitcoin.getPrice()}");
        System.out.println(STR."\{ethereum.getName()} \{ethereum.getTicker()}: U$\{ethereum.getPrice()}");

        // It is currently possible to directly change the data from outside the class
//        bitcoin.setPrice(-100.0); ; // This is a dangerous state.
        System.out.println(STR."\nAfter manual change, Bitcoin price is: \{bitcoin.getPrice()}");

        ethereum.setName("ethereano");
        System.out.println(STR."After manual change, Ethereum's name now is: \{ethereum.getName()}");

        bitcoin.displayInfo();
        ethereum.displayInfo();

        Double currentRate = 5.45;
        Double btcValueInBRL = bitcoin.calculateValueInBRL(currentRate);
        System.out.println(STR."Value of your Bitcoin in BRL: R$\{String.format("%.2f", btcValueInBRL)}");


        Stock LtDsc = new Stock("Leitura Descomplicada", "LTDCP", 25.2, "Ibovespa");
        LtDsc.displayInfo();

        Stock AAPL = new Stock("Apple Inc.", "AAPL", 195.50, "NASDAQ");

        // The type of the reference variable is the superclass.
        FinancialAsset asset1 = new Stock("Apple Inc.", "AAPL", 195.50, "NASDAQ");

        // The type of the actual object in memory is the subclass.
        FinancialAsset asset2 = new CryptoCurrency("Ethereum", "ETH", 3500.0, 420_000_000_000L);

        // Creating a list that holds any objects that "is-a" FinancialAsset.
        List<FinancialAsset> portfolio = new ArrayList<>();

        portfolio.add(new Stock("NVIDIA Corp", "NVDA", 120.0, "NASDAQ"));
        portfolio.add(new CryptoCurrency("Bitcoin", "BTC", 66000.0, 1_300_000_000_000L));
        portfolio.add(new Stock("Microsoft", "MSFT", 445.0, "NASDAQ"));
        portfolio.add(new CryptoCurrency("Solana", "SOL", 165.0, 76_000_000_000L));

        System.out.println("--- PORTFOLIO REPORT ---");
        // A single loop processes all assets uniformly.
        for (FinancialAsset asset : portfolio){
            // This is Polymorphism in action!
            asset.displayInfo();

            if (asset instanceof Stock stock){
                // If true, a new variable 'stock' of type Stock is automatically created.
                System.out.println(STR."Trades at \{stock.getExchange()}");
            } else if (asset instanceof CryptoCurrency crypto) {
                // Same here
                System.out.println(STR." -> Market Cap: $\{crypto.getMarketCap()}");
            }
        }

        List<Exportable> itemsToExport = new ArrayList<>();

        itemsToExport.add(LtDsc);
        itemsToExport.add(ethereum);
        itemsToExport.add(AAPL);
        itemsToExport.add(bitcoin);

        System.out.println(STR."""
                --- itemsToExport ---
                \{itemsToExport}""");
        exportItems(itemsToExport );
    }

    public static void exportItems (List<Exportable> items) {
        System.out.println("--- ITEMS ---");
        System.out.println(items);
        System.out.println("\n --- EXPORTING ITEMS TO CSV FORMAT ---");
        System.out.println("Name,Ticker,Price,Metadata,Type");
        for (Exportable item: items) {
            System.out.println(item.toCsvString());
        }
    }
}

