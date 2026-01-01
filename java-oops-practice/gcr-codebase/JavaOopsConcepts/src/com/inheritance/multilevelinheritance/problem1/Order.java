package com.inheritance.multilevelinheritance.problem1;

public class Order {

	public int orderId;
	public String orderDate;
	
	public Order(int orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public void getOrderStatus() {
		System.out.print("*** Order Summary ***");
		System.out.println("\nOrder id : "+orderId +"\nOrder Date :" +orderDate);
	}
}
