package main.java.chapter001;

public class StaticFactoryTest {

	public static void main(String[] args) {
		IFruit fruit = FruitStaticFactory.getInstance("peach");
		fruit.eat();
		System.out.println(fruit.taste());
		
		fruit = FruitStaticFactory.getInstance("orange");
		fruit.eat();
		System.out.println(fruit.taste());
	}
}
