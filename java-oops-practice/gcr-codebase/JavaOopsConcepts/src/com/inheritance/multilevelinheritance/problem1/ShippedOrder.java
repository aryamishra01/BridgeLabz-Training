package com.inheritance.multilevelinheritance.problem1;

public class ShippedOrder extends Order {

	public int trackingNumber;
	
	public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	@Override
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Tracking Number: "+trackingNumber);
	}
	
}
