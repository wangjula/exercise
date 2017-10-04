package main.java.observer.demo001;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject<Observer> {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	private boolean changed = false;
	
	public boolean getChange() {
		return changed;
	}

	public void setChange(boolean changed) {
		this.changed = changed;
	}

	@Override
	public void addObserver(Observer observer) {
		if (observer != null) {
			observers.add(observer);
		}
	}

	@Override
	public void deleteObserver(Observer observer) {
		if (observer != null) {
			observers.remove(observer);
		}
	}

	@Override
	public void removeAllObservers() {
		observers.clear();
	}

	@Override
	public void notifyObserver(Observer observer) {
		if (!getChange()) {
			return;
		}
		setChange(false);
		observer.update(this);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			notifyObserver(o);
		}
	}

}
