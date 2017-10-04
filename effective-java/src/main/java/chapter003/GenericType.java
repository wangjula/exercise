package main.java.chapter003;

import java.util.Arrays;
import java.util.List;

public class GenericType {

	public static void print(List<?> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<String> ss = Arrays.asList(new String[] {"one", "two", "three"});
		print(ss);
	}
}
