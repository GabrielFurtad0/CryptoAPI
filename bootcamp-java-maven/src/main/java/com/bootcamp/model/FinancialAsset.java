package com.bootcamp.model;

public abstract class FinancialAsset {

    // 'protected' allows access by subclasses but not the outside world
    protected String name;
    protected String ticker;
    protected Double price;

    public FinancialAsset(String name, String ticker, Double price) {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println(STR."\{this.name} (\{this.ticker}) - Price: \{this.price}");
    }

    //Getters
    public String getName(){ return name; }
    public String getTicker() { return ticker; }
    public Double getPrice() { return price; }
}
