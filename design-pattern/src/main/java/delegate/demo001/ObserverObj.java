package main.java.delegate.demo001;

import main.java.observer.demo001.State;

public class ObserverObj {

	private State state = State.UNCHANGED;
	
	public void changeState() {
		state = State.CHANGED;
	}
	
	public State getState() {
		return state;
	}
}
