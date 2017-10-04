package main.java.chapter001;

public class Peach implements IFruit {

	@Override
	public void eat() {
		System.out.println("Eatting peach");
	}

	@Override
	public String taste() {
		return "Taste pretty sweet";
	}

}
