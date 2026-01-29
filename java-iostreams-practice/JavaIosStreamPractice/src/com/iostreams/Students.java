package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Students {
	public static void main(String[] args) {

		String filePath = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\students.csv";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

			String line;


			while ((line = bufferedReader.readLine()) != null) {
				String[] columns = line.split(",");
				System.out.println(columns[0]+", " + columns[1] +", " +  columns[2] +", " + columns[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}