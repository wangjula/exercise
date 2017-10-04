package main.java.decorator.demo001;

public class People implements Showable{

	private String name;
	
	public People(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void show() {
		System.out.println("name: " + name);
	}
}
