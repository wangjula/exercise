package main.java.observer.demo001;

public class ConcreteObserver implements Observer{
	
	/**
	 * 观察者状态
	 */
	private State observerState = State.UNCHANGED;
	
	public void changeState(State state) {
		this.observerState = state;
	}
	
	public State getState() {
		return observerState;
	}

	@Override
	public void update(Object o) {
		if (o instanceof Subject) {
			System.out.println("received subject nofity, subject = " + o);
			observerState = State.CHANGED;
		}
	}

}
