package main.java.utils;

public class StringUtils {

	public static boolean isEmpty(String s) {
		if (s == null || s.trim().equals("")) {
			return true;
		}
		return false;
	}
	
	public static String upperCaseFirst(String str) {
		if (isEmpty(str)) {
			return str;
		}
		
		char c = str.trim().charAt(0);
		if (c < 'a' || c > 'z') {
			throw new RuntimeException("the first letter must be capital");
		}
		
		return (char) (c - 32) + str.substring(1);
	}
}
