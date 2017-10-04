package main.java.delegate.demo001;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {

	private List<Event> events;
	
	public EventHandler() {
		events = new ArrayList<Event>();
	}
	
	public void handle() {
		for (Event event : events) {
			event.invoke();
		}
	}
	
	public void addEvent(Event event) {
		events.add(event);
	}
	
	public void removeEvent(Event event) {
		events.remove(event);
	}
	
	public void removeAll() {
		events.clear();
	}
}
