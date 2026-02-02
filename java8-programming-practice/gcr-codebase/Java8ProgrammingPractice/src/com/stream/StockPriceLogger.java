package com.stream;

import java.util.*;
import java.util.stream.*;

class Stock {
    String symbol;
    double price;

    Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public String toString() {
        return symbol + " -> Price: " + price;
    }
}

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Stock> liveFeed = Arrays.asList(
            new Stock("AAPL", 182.45),
            new Stock("GOOGL", 134.20),
            new Stock("AMZN", 155.60),
            new Stock("MSFT", 412.30)
        );

        // Display all stock prices
        liveFeed.stream()
                .forEach(stock -> 
                    System.out.println("Live Update: " + stock)
                );
    }
}
