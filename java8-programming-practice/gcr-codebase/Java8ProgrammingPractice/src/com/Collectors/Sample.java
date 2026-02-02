package com.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample {
  public static void main(String [] agrs) {
	  
	  
	     List<String> s=Arrays.asList("Sanchit","Sanchit","Nayan","harshit");
	     
	     Map<Character, List<String>> map =s.stream().collect(Collectors.groupingBy(a->a.charAt(0)));
	     System.out.println(map);
	     
	     s.stream().collect(Collectors.toSet()).forEach(a->System.out.println(a));
	     

  }
}
