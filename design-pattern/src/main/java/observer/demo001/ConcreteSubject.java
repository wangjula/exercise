package main.java.observer.demo001;

public class ConcreteSubject extends Subject {

	/**
	 * 被观察者状态
	 */
	private State subjectState = State.UNCHANGED;
	
	public void changeState() {
		subjectState = State.CHANGED;
		setChange(true);
		notifyObservers();
	}
	
	public State getState() {
		return subjectState;
	}
}
