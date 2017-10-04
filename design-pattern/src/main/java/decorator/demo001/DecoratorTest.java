package main.java.decorator.demo001;

public class DecoratorTest {

	public static void main(String[] args) {
		new ConcreteDecoratorB(new ConcreteDecoratorA(new People("krz"))).show();;
	}

}
