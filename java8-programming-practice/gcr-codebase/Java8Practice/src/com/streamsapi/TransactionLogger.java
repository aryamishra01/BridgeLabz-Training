package com.streamsapi;

import java.util.*;
import java.time.LocalDateTime;

public class TransactionLogger {
	
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TXN101", "TXN102", "TXN103");

        // Log each transaction with timestamp
        transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}

