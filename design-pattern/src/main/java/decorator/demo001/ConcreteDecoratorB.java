package main.java.decorator.demo001;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Showable showable) {
		super(showable);
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Decorator : D-B");
	}
}
