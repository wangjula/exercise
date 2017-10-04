package main.java.observer.demo001;

/**
 * 观察者模式：使对象状态联动变化
 * 
 * 通过将向Subject注册Observer,使Subject状态改变时通知Observer更新自己</br>
 * <b>优点:</b></br>
 * 1. 观察者模式解耦了具体的被观察者和观察者，只依赖抽象</br>
 * 2. 被观察者支持通知多个观察者</br>
 * <b>缺点:</b></br>
 * 1. 注册的观察者过多，会影响通知的效率</br>
 * 2. 可能导致被观察者与观察者的循环依赖</br>
 * 3. 如果通过异步线程通知观察者，系统必须保障投递通知是以自洽方式进行的</br>
 * 4. 观察者无法知晓被观察者如何变化的细节</br>
 * @author wangjiuliang
 *
 */
public class ObserverTest {

	public static void main(String[] args) {

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
