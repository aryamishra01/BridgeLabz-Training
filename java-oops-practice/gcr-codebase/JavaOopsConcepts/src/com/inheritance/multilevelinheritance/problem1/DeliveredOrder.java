package com.inheritance.multilevelinheritance.problem1;

public class DeliveredOrder extends ShippedOrder {
	
	public String deliveryDate;
	
	public DeliveredOrder(int orderId, String orderDate,int trackingNumber, String deliveryDate){
		super(orderId, orderDate,trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	@Override
	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("Delivery date: "+deliveryDate);
	}
}
