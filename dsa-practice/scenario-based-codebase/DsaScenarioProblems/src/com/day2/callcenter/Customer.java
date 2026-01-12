package com.day2.callcenter;

public class Customer implements Comparable<Customer> {
	String name;
	int id;
	boolean isVIP;
	int callTime;

	public Customer(String name, int id, boolean isVIP, int callTime) {
		super();
		this.name = name;
		this.id = id;
		this.isVIP = isVIP;
		this.callTime = callTime;
	}

	@Override
	public int compareTo(Customer other) {
		return this.callTime - other.callTime; // earlier calls get higher priority
	}

}
