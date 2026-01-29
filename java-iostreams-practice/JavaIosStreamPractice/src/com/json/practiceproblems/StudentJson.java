package com.json.practiceproblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {

	public static void main(String[] args) {

		JSONObject student = new JSONObject();
		student.put("name", "Keshav");
		student.put("age", 22);

		JSONArray subjects = new JSONArray();
		subjects.put("Java");
		subjects.put("Spring Boot");
		subjects.put("MySQL");

		student.put("subjects", subjects);

		System.out.println(student.toString(4));
	}
}