package com.lambda.notification;
import java.util.*;
import java.util.function.Predicate;

public class HospitalAlerts {

	public static void main(String[] args) {
		
		List<Alert> alerts = new ArrayList<>();

		alerts.add(new Alert("Emergency", "Heart rate critical"));
		alerts.add(new Alert("Medicine", "Take BP medicine at 10 AM"));
		alerts.add(new Alert("Appointment", "Doctor visit at 8 PM"));
		alerts.add(new Alert("Emergency", "Oxygen level low"));

		Predicate<Alert> emergencyOnly = alert -> alert.type.equals("Emergency");

		System.out.println("Filtered Alerts:");

		for (Alert alert : alerts) {
			if (emergencyOnly.test(alert)) {
				System.out.println(alert);
			}
		}
	}
}