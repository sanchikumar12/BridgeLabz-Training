package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

	public static void main(String[] args) {

		String filePath =  "D:\\File Handling\\CSV_Files\\employee.csv";
		int recordCount = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			reader.readLine();

			while ((line = reader.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				recordCount++;
			}

			System.out.println("Total Records = " + recordCount);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}