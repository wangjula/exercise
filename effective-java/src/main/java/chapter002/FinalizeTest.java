package main.java.chapter002;

public class FinalizeTest {

	public static void main(String[] args) {
		Base base = new Base();
		SubClass sub = new SubClass();
		try {
			sub.finalize();
		} finally {
			base.finalize();
		}
	}

}
