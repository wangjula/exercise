package main.java.decorator.demo001;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Showable showable) {
		super(showable);
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("Decorator: D-A");
	}

}
