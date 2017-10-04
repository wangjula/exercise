package main.java.chapter003;

import java.math.BigInteger;

public class SafeInstance {

	public static BigInteger safeInstance(BigInteger val) {
		if (val.getClass() != BigInteger.class) {
			return new BigInteger(val.toByteArray());
		}
		return val;
	}
}
