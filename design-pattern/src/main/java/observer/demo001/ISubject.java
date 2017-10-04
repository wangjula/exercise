package main.java.observer.demo001;

public interface ISubject<T> {

	/**
	 * 添加观察者
	 * 
	 * @param observer
	 */
	void addObserver(T observer);
	
	/**
	 * 移除观察者
	 * 
	 * @param observer
	 */
	void deleteObserver(T observer);
	
	/**
	 * 移除所有观察者
	 * 
	 */
	void removeAllObservers();
	
	/**
	 * 通知观察者
	 * 
	 * @param observer
	 */
	void notifyObserver(T observer);
	
	/**
	 * 通知所有观察者
	 * 
	 */
	void notifyObservers();
}
