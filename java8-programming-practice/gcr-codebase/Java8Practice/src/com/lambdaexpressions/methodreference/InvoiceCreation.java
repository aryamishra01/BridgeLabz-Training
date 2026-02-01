package com.lambdaexpressions.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceCreation {
	
	int transactionId;
	
	InvoiceCreation(int transactionId){
		this.transactionId = transactionId;
	}
	
	void showInvoice() {
		System.out.println("Invoice generated for transaction id : "+transactionId);
	}

	public static void main(String[] args) {
		
		List<Integer> transactionIds = Arrays.asList(101, 102, 103, 104, 105);
		
		List<InvoiceCreation> invoices = transactionIds.stream().map(InvoiceCreation :: new).collect(Collectors.toList());
		
		invoices.forEach(InvoiceCreation :: showInvoice);

	}

}
