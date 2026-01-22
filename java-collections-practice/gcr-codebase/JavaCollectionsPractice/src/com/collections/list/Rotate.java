package com.collections.list;

import java.util.*;

public class Rotate {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers you want to enter : ");
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i < n; i++) { 
			System.out.println("Add number " +(i+1));
			int number = sc.nextInt();
			list.add(number);
		}
		
		System.out.println("Show list : " +list);
		
		System.out.println("Rotate by which index : ");
		int num = sc.nextInt();
		
		while(num-- > 0) {
			int temp = list.get(0);
			for(int i = 1 ; i <= list.size() - 1 ; i++) {
				list.set(i-1, list.get(i));
			}
			list.set(list.size()-1, temp);
		}
			
		System.out.println("Show list after rotating : " +list);
			
	}
}
