package com.lambdaexpressions.customsorting;

import java.util.ArrayList;
import java.util.List;

public class ECommerceSorting {

	public static void main(String[] args) {
		
		List<Product> p = new ArrayList();
		
		p.add(new Product("Laptop", 60000,4.5,10));
		p.add(new Product("Mobile", 30000,4.2,20));
		p.add(new Product("Tablet", 25000,4.0,15));
		
		
		//sort by price
		p.sort((p1,p2) -> Double.compare(p1.price, p2.price));
		
		//sort by rating
		p.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
		
		//sort by discount
		p.sort((p1,p2) -> Double.compare(p2.discount, p1.discount));

		//print
		p.forEach(obj ->
        System.out.println(obj.name + " " + obj.price + " " + obj.rating + " " + obj.discount));

	}
}
