package main.java.chapter003;

import java.util.Comparator;

public class Host {
	
	public static final Comparator<String> STRING_LEN_COMPARATOR = new StringLenCmp();

	private static class StringLenCmp implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {

			if (s1 == null || s2 == null) {
				throw new RuntimeException("arg should not be null");
			}
			return s1.length() - s2.length();
		}
		
	}
}
