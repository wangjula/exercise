package main.java.observer.demo001;

public class ObserverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver observer = new ConcreteObserver();
		subject.addObserver(observer);
		
		System.out.println("========before change subject's state=====");
		
		System.out.println("subject state: " + subject.getState().name());
		System.out.println("observer state: " + observer.getState().name());
		
		System.out.println("========now change subject's state========");
		
		subject.changeState();
		System.out.println("subject state: " + subject.getState().name());
		System.out.println("observer state: " + observer.getState().name());
		
	}

}
