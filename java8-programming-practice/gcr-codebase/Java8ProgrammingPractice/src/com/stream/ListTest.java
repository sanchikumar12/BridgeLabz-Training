package com.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ListTest {
   public static void main(String[] agrs) {
	   List<String> names =Arrays.asList("Sanchit","An","Ra","Kundan");
	   Stream<String> name =names.stream();
	   
	   name.filter(a->a.length()<3).map(b-> b+"Hellow").forEach(d->System.out.println(d));
	   
	               List<Integer> l =Arrays.asList(1,4,2,3,7,8,9,0);
	               
	               l.stream().map(a->a*a).forEach(d->System.out.println(d));
	               
	               List<String> days =Arrays.asList("Sanchit","R","Rahul","Ra","Rz","Kabir","Manish");
	               
	               days.stream().filter(a ->a.startsWith("R")).sorted().limit(3).forEach(e->System.out.println(e));;
	               
	     
   }
}
