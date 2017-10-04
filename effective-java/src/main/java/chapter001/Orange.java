package main.java.chapter001;

public class Orange implements IFruit {

	@Override
	public void eat() {
		System.out.println("Eatting orange!");
	}

	@Override
	public String taste() {
		return "Taste very sour";
	}

}
