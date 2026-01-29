package com.json.practiceproblems;

import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadJsonSpecificFields {
	public static void main(String[] args) {
		try {
			
			FileReader reader=new FileReader("C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\students.json");
			JSONTokener tokener=new JSONTokener(reader);
			JSONObject jsonObject=new JSONObject(tokener);
			
			String name=jsonObject.getString("name");
			String email=jsonObject.getString("email");
			
			System.out.println("Name: "+name );
			System.out.println("Email: "+email);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}