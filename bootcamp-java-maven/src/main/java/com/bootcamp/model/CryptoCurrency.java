package com.bootcamp.model;

//public class CryptoCurrency {
//
//    private String name;
//    private String ticker;
//    private Double price;
//    private Long marketCap;
//
//
//    public CryptoCurrency(String name, String ticker, Double price, Long marketCap) {
//        this.name = name;
//        this.ticker = ticker;
//        this.setPrice(price);
//        this.marketCap = marketCap;
//    }
//
//
//    // --- Getter Methods ---
//    // Allows controlled read-access to the (now private) field.
//    public String getName(){
//        return this.name;
//    }
//
//    public Double getPrice(){
//        return this.price;
//    }
//
//    public String getTicker(){
//        return this.ticker;
//    }
//
//    public Long getMarketCap(){
//        return this.marketCap;
//    }
//
//
//    // --- Setter Methods ---
//    // Allows controlled write-access to the (now private) field.
//
//    public void setName(String name){
//        this.name = name; // // 'this.name' refers to the field, 'name' refers to the parameter.
//    }
//
//    public void setPrice(Double price){
//        // The validation logic for the price.
//        if (price != null && price >=0) {
//            this.price = price;
//        } else {
//            System.err.println("Error: Price cannot be negative or null");
//        }
//    }
//
//    // A method that defines a self-containing behavior
//    public void displaySummary(){
//        System.out.println(STR."\{this.name} (\{this.ticker}): Price is $\{this.price}");
//    }
//
//    // A method that takes an argument and performs a calculation.
//    public Double calculateValueInBRL(Double usdToBrlRate) {
//        if (this.price == null){
//            return 0.0;
//        }
//        return this.price * usdToBrlRate;
//    }
//
//    @Override
//    public String toString(){
//        return STR."CryptoCurrency{name='\{name}', ticker='\{ticker}', price=\{price}";
//    }
//}

import com.bootcamp.service.Exportable;
import java.util.Objects;

public class CryptoCurrency extends FinancialAsset implements Exportable {

        // Calling the unique field to CryptoCurrency
        private Long marketCap;

        public CryptoCurrency(String name, String ticker, Double price, Long marketCap){
            // Calling the initializer of the inherited fields
            super(name, ticker, price);
            // Initializing the unique field to CryptoCurrency
            this.marketCap = marketCap;
        }

        // unique getter
        public Long getMarketCap(){
            return marketCap;
        }

        // --- Setter Methods ---
        // Allows controlled write-access to the (now private) field.

        public void setName(String name){
            this.name = name; // // 'this.name' refers to the field, 'name' refers to the parameter.
        }

        public void setPrice(Double price){
            // The validation logic for the price.
            if (price != null && price >=0) {
                this.price = price;
            } else {
                System.err.println("Error: Price cannot be negative or null");
            }
        }

        // A method that defines a self-containing behavior
        public void displaySummary(){
            System.out.println(STR."\{this.name} (\{this.ticker}): Price is $\{this.price}");
        }

        // A method that takes an argument and performs a calculation.
        public Double calculateValueInBRL(Double usdToBrlRate) {
            if (this.price == null){
                return 0.0;
            }
            return this.price * usdToBrlRate;
        }

//        @Override
//        public void displayInfo() {
//            System.out.println(STR."CryptoCurrency{name='\{this.getName()}', ticker='\{this.getTicker()}', price=\{this.getPrice()}, marketCap=\{this.getMarketCap()}");
//        }

    @Override
    public String toCsvString() {
        return STR."\{getName()},\{getTicker()},\{getPrice()},\{getMarketCap()},CrptoCurrency";
    }

    @Override
    public boolean equals(Object o) {
            // 1. An object must always be equal to itself
            if (this == o) return true;
            // 2. An object cannot be equal to null, or an object of a different class.
            if (o == null || getClass() != o.getClass()) return false;
            // 3. Casting the objects and comparing the fields that define equality.
            CryptoCurrency that = (CryptoCurrency) o;
            // In this case, two cryptos are the same if their ticker is the same.
            return Objects.equals(this.ticker, that.ticker);


//        // Step 1: Check if the two variables are pointing to the exact same object in memory.
//        // If they are, they are definitely equal.
//        if(this == o) {
//            return true;
//        }
//
//        // Step 2: Use the modern 'instanceof' pattern.
//        // This single line does THREE things for us automatically:
//        //    a) It checks if 'o' is null. If it is, the result is false.
//        //    b) It checks if the object 'o' is an instance of the CryptoCurrency class.
//        //    c) If both checks pass, it automatically creates a NEW variable named 'that'
//        //       of type CryptoCurrency and makes it point to the same object as 'o'.
//        if (o instanceof CryptoCurrency that) {
//            // Step 3: Because we are inside this if-block, we are GUARANTEED that 'that'
//            // is a valid CryptoCurrency. We can now safely access its fields for comparison.
//            // We use the helper 'Objects.equals' to safely handle if 'this.ticker' is null.
//            return Objects.equals(this.ticker, that.ticker);
//        }
//        return false;
    }

    @Override
    public  int hashCode() {
            // The hash code must be generated from the same fields used in the equals() method.
            return Objects.hash(this.ticker);
    }
}
