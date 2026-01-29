package com.json.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterUsersByAge {

	public static void main(String[] args) throws Exception {

		String json = """
				[
				    { "name": "Keshav", "age": 29 },
				    { "name": "Aman", "age": 28 },
				    { "name": "Rhoit", "age": 30 },
				    { "name": "Ankit", "age": 24 }
				]
				""";

		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(json);

		for (JsonNode node : rootNode) {
			if (node.get("age").asInt() > 25) {
				System.out.println(node.toPrettyString());
			}
		}
	}
}