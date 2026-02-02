package com.functionaiInterfaces.temperaturealertsystem;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
	public static void main(String[] args) {
		double threshold = 40.4;
		
		Predicate<Double> isHighTemperature = temp -> temp > threshold;
		
		double currentTemperature = 15.5;
		
		if(isHighTemperature.test(currentTemperature)) {
			System.out.println("ALERT! Temperature crossed the threshold.");
		}
		else {
			System.out.println("Temperature is normal.");
		}
	}
}
