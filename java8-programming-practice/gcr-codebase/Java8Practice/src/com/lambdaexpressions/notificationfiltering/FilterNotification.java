package com.lambdaexpressions.notificationfiltering;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterNotification {

	public static void main(String[] args) {
		
		List<Alert> list = Arrays.asList(new Alert("Emergency", "Heart rate critical"),
		        						new Alert("Reminder", "Take medicine"),
		        						new Alert("Appointment", "Doctor visit at 5 PM"));
		
		Predicate<Alert> emergencyOnly = alert -> alert.type.equals("Emergency");
		
		list.stream().filter(emergencyOnly).forEach(a -> System.out.println(a.message));

	}

}
