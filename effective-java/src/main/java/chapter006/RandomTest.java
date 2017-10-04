package main.java.chapter006;

import java.util.Random;

public class RandomTest {
	
	public static int random(Random rand, int n) {
		return Math.abs(rand.nextInt()) % n;
	}

	public static void main(String[] args) {
		int n = Integer.MAX_VALUE / 2;
		int low = 0;
		Random rand = new Random(47);
		for (int i = 0; i < 10000000; i ++) {
			if (random(rand, n) < n/2) {
				low ++;
			}
		}
		System.out.println("low: " + low);
		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
		System.out.println("abs:" + Math.abs(Integer.MIN_VALUE+1));
	}

}
