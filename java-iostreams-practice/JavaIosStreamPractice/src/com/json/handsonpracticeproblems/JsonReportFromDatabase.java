package com.json.handsonpracticeproblems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReportFromDatabase {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/testdb";
		String username = "user";
		String password = "password@123";

		List<Map<String, Object>> report = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

			while (rs.next()) {
				Map<String, Object> row = new HashMap<>();
				row.put("id", rs.getInt("id"));
				row.put("name", rs.getString("name"));
				row.put("salary", rs.getDouble("salary"));
				report.add(row);
			}

			ObjectMapper mapper = new ObjectMapper();
			String jsonReport = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(report);

			System.out.println(jsonReport);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}