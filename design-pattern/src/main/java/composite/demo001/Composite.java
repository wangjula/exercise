package main.java.composite.demo001;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public <T extends Component> void add(T e) {
		children.add(e);
	}

	@Override
	public <T extends Component> void remove(T e) {
		children.remove(e);
	}

	@Override
	public void display(int depth) {
		super.display(depth);
		for (Component child : children) {
			child.display(depth + 1);
		}
	}

}
