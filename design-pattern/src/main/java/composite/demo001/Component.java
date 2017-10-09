package main.java.composite.demo001;

public abstract class Component {

	private String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract <T extends Component> void add(T  e);
	
	public abstract <T extends Component> void remove(T e);
	
	public void display(int depth) {
		if (depth <= 0) {
			throw new RuntimeException("unaccepted depth: " + depth);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i ++) {
			sb.append("-");
		}
		System.out.println(sb.toString() + getName());
	}
}
