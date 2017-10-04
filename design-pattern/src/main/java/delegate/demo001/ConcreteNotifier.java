package main.java.delegate.demo001;

import main.java.observer.demo001.State;

public class ConcreteNotifier extends Notifier {

	private State state = State.UNCHANGED;
	
	public void changeState() {
		state = State.CHANGED;
		notifyAllHandler();
	}
	
	public State getState() {
		return state;
	}
}
