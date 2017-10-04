package main.java.delegate.demo001;

public class Notifier {

	private EventHandler eventHandler;
	
	public Notifier() {
		eventHandler = new EventHandler();
	}
	
	public void addListener(Object obj, String methodName, Object[] params, Class<?>[] paramTypes) {
		eventHandler.addEvent(new Event(obj, methodName, params, paramTypes));
	}
	
	public void removeListener(Event event) {
		eventHandler.removeEvent(event);
	}
	
	public void notifyAllHandler() {
		eventHandler.handle();
	}
	
	public void removeAllListener() {
		eventHandler.removeAll();
	}
}
