package com.streamsapi;

import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}


public class ClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 50000),
            new Claim("Health", 70000),
            new Claim("Vehicle", 30000),
            new Claim("Vehicle", 45000)
        );

        Map<String, Double> averageClaims =
								        		claims.stream()
												.collect(Collectors.groupingBy(
												c -> c.type,                         			// group by claim type
												Collectors.averagingDouble(c -> c.amount)		// calculate average amount
												));

        // print average claim per type
        averageClaims.forEach((type, avg) ->
            System.out.println(type + " Avg Claim = " + avg)
        );
    }
}

