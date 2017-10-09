package main.java.composite.demo001;

public class Leaf extends Component{
	
	public Leaf(String name) {
		super(name);
	}

	@Override
	public <T extends Component> void add(T e) {
		throw new UnsupportedOperationException("leaf can't add a child");
	}

	@Override
	public <T extends Component> void remove(T e) {
		throw new UnsupportedOperationException("leaf can't remove a child");
	}

}
