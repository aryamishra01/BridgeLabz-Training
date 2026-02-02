package com.streamsapi;

import java.util.*;

public class StockPriceLogger {
	
    public static void main(String[] args) {
    	
        List<Double> stockPrices = Arrays.asList(120.5, 121.8, 119.4, 122.1);

        // forEach prints each stock price
        stockPrices.forEach(price ->
            System.out.println("Stock Price: " + price)
        );
    }
}

