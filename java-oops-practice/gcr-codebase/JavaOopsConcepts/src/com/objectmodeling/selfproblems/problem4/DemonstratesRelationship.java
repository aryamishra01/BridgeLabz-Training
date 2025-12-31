package com.objectmodeling.selfproblems.problem4;

public class DemonstratesRelationship {

	    public static void main(String[] args) {

	        // Create products
	        Product p1 = new Product(1, "Laptop", 55000);
	        Product p2 = new Product(2, "Mouse", 800);
	        Product p3 = new Product(3, "Keyboard", 1500);

	        // Create customer
	        Customer customer = new Customer(101, "Arya");

	        // Create order
	        Order order1 = new Order(1001);

	        // Add products to order (aggregation)
	        order1.addProduct(p1);
	        order1.addProduct(p2);
	        order1.addProduct(p3);

	        // Customer places order (association + communication)
	        customer.placeOrder(order1);

	        System.out.println();

	        // Display order details
	        customer.showOrders();
	    }
}
