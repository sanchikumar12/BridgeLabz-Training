package com.functionaiInterfaces.stringlengthchecker;
import java.util.function.Function;


public class CheckLength {
	public static void main(String[] args) {
		
		int charLimit = 10;
		Function<String, Integer> lengthFunction  = str -> str.length(); 
		
		String message = "This is sample message.";
		
		int length = lengthFunction.apply(message);
		
		if (length > charLimit) {
            System.out.println("Message exceeds character limit!");
        } else {
            System.out.println("Message is within character limit.");
        }

        System.out.println("Message Length: " + length);
	}
}
