package com.bootcamp.service;

import com.bootcamp.model.CryptoCurrency;

import java.util.HashSet;
import java.util.Set;

public class UniquePortfolio {

    public static void main(String[] args) {

        Set<CryptoCurrency> CryptoCurrencies = new HashSet<>();

        CryptoCurrencies.add( new CryptoCurrency("Bitcoin", "BTC", 66000.0, 1_300_000_000_000L));
        CryptoCurrencies.add( new CryptoCurrency("Bitcoinz", "BTC", 36000.0, 1_220_000_000_000L));
        CryptoCurrencies.add( new CryptoCurrency("Solana", "SOL", 165.0, 76_000_000_000L));

        System.out.println("--- Crypto Portfolio ---");
        System.out.println(STR."The portfolio size is: \{CryptoCurrencies.size()}");

        for (CryptoCurrency crypto : CryptoCurrencies ) {
            crypto.displayInfo();
        }

    }
}
