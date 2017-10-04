package main.java.observer.demo001;

/**
 * 标记状态发生改变
 * @author wangjiuliang
 *
 */
public enum State {

	/**
	 * 未改变
	 */
	UNCHANGED(0),
	
	/**
	 * 已改变
	 */
	CHANGED(1);
	
	private final int id;
	
	private State(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static State valueOf(int id) {
		State[] values = State.values();
		for (State value : values) {
			if (value.id == id) {
				return value;
			}
		}
		throw new RuntimeException("not exist such State, id = " + id);
	}
}
