package com.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TransformingName {

	public static void main(String[] args) {
		List<String> n= Arrays.asList(
	          "ankush","sanchit","nikhil","Gupta"
	        );
		
		n.stream().map(a->a.toLowerCase()).forEach(b->System.out.println(b));

	}

}
