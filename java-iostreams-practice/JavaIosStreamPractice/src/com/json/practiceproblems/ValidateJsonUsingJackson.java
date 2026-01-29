package com.json.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonUsingJackson {

	public static void main(String[] args) {

		String json = "{ \"name\": \"Keshav\", \"age\": 92 }";

		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.readTree(json);

			System.out.println("Valid JSON");

		} catch (Exception e) {
			System.out.println("Invalid JSON");
		}
	}
}