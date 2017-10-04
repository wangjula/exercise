package main.java.decorator.demo001;

public class Decorator implements Showable {
	
	private Showable showable;
	
	public Decorator(Showable showable) {
		this.showable = showable;
	}

	@Override
	public void show() {
		if (null != showable) {
			showable.show();
		}
	}

}
