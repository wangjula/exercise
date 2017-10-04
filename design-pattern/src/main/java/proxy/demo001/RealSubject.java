package main.java.proxy.demo001;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("realRequest");
	}

}
