package main.java.chapter002;

public class Base {

	@Override
	public void finalize() {
		System.out.println("Base is finalized!");
	}
}
