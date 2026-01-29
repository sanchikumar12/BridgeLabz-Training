package com.json.handsonpracticeproblems;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray {

	static class User {

		private String name;
		private int age;

		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) throws Exception {

		List<User> users = new ArrayList<>();
		users.add(new User("Keshav", 22));
		users.add(new User("abhi", 28));
		users.add(new User("kesh", 30));


		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);


		System.out.println(jsonArray);
	}
}