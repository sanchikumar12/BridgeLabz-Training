// Creating VowelsAndConsonants class to find vowels and consonants
import java.util.*;
public class VowelsAndConsonants{

        // Method to count vowels
	public static int vowels(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' 
				|| str.charAt(i)=='o' || str.charAt(i)=='u'){
				count++;
			}	
		}
		return count;
	}

        // Method to count vowels
	public static int consonants(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!='a' || str.charAt(i)!='e' || str.charAt(i)!='i' 
				|| str.charAt(i)!='o' || str.charAt(i)!='u'){
				count++;
			}	
		}
		return count;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toLowerCase();
		System.out.println("Number of vowels are: " + vowels(str));
		System.out.println("Number of consonants are: " + consonants(str));
		
		
	}
}