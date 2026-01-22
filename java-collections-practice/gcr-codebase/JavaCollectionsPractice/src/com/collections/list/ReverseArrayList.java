package com.collections.list;

import java.util.*;

public class ReverseArrayList {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter : ");
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i < n; i++) { 
			System.out.println("Add number " +(i+1));
			int number = sc.nextInt();
			list.add(number);
		}
		
		System.out.println("Show list : " +list);
		
		List<Integer> listRev = new ArrayList<>();
		
		for(int i = list.size()-1 ; i >=0 ; i--) {
			listRev.add(list.get(i));
		}
		
		System.out.println("Show reversed list : " +listRev);
	}	
}

