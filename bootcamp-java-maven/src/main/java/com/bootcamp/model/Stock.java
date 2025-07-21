package com.bootcamp.model;

import com.bootcamp.service.Exportable;

public class Stock extends FinancialAsset implements Exportable {
    // Field only use in Stock
    private String exchange;

    public Stock(String name, String ticker, Double price, String exchange) {
        // the super must be the first line, it calls the superclass constructor to initialize inherit fields
        super(name, ticker, price);
        // After that you can initialize the fields that are unique to this subclass
        this.exchange = exchange;
    }

    public String getExchange() {
        return exchange;
    }

    @Override
    public void displayInfo(){
        // Providing a more specific display just for the stock option
        System.out.println(STR."\{this.getName()} (\{this.getTicker()}) on \{this.getExchange()} is priced at $\{this.getPrice()}");
    }

    @Override
    public String toCsvString() {
        return STR."\{getName()},\{getTicker()},\{getPrice()},\{getExchange()},Stock";
    }
}
