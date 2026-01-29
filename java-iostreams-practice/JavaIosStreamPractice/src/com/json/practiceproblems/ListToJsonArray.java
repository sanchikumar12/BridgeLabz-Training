package com.json.practiceproblems;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray {

	static class Car {

		private String brand;
		private String model;
		private int price;

		public Car(String brand, String model, int price) {
			this.brand = brand;
			this.model = model;
			this.price = price;
		}
		public String getBrand() {
			return brand;
		}

		public String getModel() {
			return model;
		}

		public int getPrice() {
			return price;
		}
	}

	public static void main(String[] args) throws Exception {

		List<Car> cars = new ArrayList<>();
		cars.add(new Car("BMW", "X5", 7500000));
		cars.add(new Car("Audi", "Q7", 7200000));
		cars.add(new Car("Mercedes", "GLC", 6800000));

		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cars);

		System.out.println(jsonArray);
	}
}