package com.lambdaexpressions.methodreference;

import java.util.Arrays;
import java.util.List;

public class PatientIdPrint {

	public static void main(String[] args) {
		
		List<Integer> patientIds = Arrays.asList(101,102,103,104);
		
		//method references
		patientIds.forEach(System.out:: println);

	}

}
