package com.lambda.ecommerce;

import java.util.*;

public class ECommerceSorting {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		products.add(new Product(101, "IPad", 15000, 3.5, 30));
		products.add(new Product(102, "Laptop", 75000, 4.7, 19));
		products.add(new Product(103, "Headphones", 2000, 4.2, 30));
		products.add(new Product(104, "Smart Watch", 8000, 4.4, 20));

		products.sort((p1, p2) -> {
			return Double.compare(p1.price, p2.price);
		});

		System.out.println("sorted by Price:");
		products.forEach(System.out::println);


		products.sort((p1, p2) -> {
			return Double.compare(p2.rating, p1.rating);
		});
		System.out.println("\nSorted by rating:");
		products.forEach(System.out::println);


		products.sort((p1, p2) -> {
			return Double.compare(p2.discount, p1.discount);
		});

		System.out.println("\nSorted by discount:");
		products.forEach(System.out::println);
	}
}