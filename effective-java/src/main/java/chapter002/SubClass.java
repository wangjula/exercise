package main.java.chapter002;

public class SubClass extends Base {

	@Override
	public void finalize() {
		System.out.println("Sub is finalized!");
	}
}
