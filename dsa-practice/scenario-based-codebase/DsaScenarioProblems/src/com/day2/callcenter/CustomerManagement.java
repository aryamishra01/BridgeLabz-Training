package com.day2.callcenter;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerManagement {
	Queue<Customer> normalCustomer = new ArrayDeque<>();
	Queue<Customer> vipCustomer = new PriorityQueue<>();
	// key is the customer name and value is the number of calls
	HashMap<String, Integer> map = new HashMap<>();

	public void addIncomingCall(Customer c) {
		if (c.isVIP) {
			vipCustomer.add(c);
			// increase the call count
			map.put(c.name, map.getOrDefault(c.name, 0) + 1);

		} else {
			normalCustomer.add(c);
			// increase the call count
			map.put(c.name, map.getOrDefault(c.name, 0) + 1);

		}
	}

	public Customer serveNextCustomer() {

		if (!vipCustomer.isEmpty()) {
			return vipCustomer.poll(); // removes and returns
		}

		if (!normalCustomer.isEmpty()) {
			return normalCustomer.poll();
		}

		return null; // nobody is waiting
	}

	public void getCallCount(String name) {
		if (map.containsKey(name)) {
			int count = map.get(name);
			System.out.println(name + " has called " + count + " number of times this month!!");
		} else {
			System.out.println("Caller dosen't exist!!");
		}
	}

	public boolean isAnyCallWaiting() {
		if (vipCustomer.isEmpty() && normalCustomer.isEmpty()) {
			return false; // no caller waiting
		} else {
			return true; // caller waiting
		}
	}

	// To monitor high-priority user.
	public int getWaitingVIPCount() {
		return vipCustomer.size(); // returning queue size
	}

	// To monitor regular users.
	public int getWaitingNormalCount() {
		return normalCustomer.size();
	}

	public void resetMonthlyData() {
		map.clear();
	}
}
