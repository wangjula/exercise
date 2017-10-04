package main.java.delegate.demo001;

/**
 * 事件委托模型，为被观察者添加观察者的监听事件，状态发生改变通过EventHandler处理事件，从而改变观察者的状态
 * <b>优点</b></br>
 * 1. 委托可以用于观察者无法实现Observer接口的情况，EventHandler处理事件调用的方法可以不属于同一个类，一次通知可以调用多个方法</br>
 * 2. Notifier与实际的观察者完全解耦</br>
 * 3. 扩展性好</br>
 * 
 * @author wangjiuliang
 *
 */
public class DelegateTest {

	public static void main(String[] args) {

		ObserverObj observerObj = new ObserverObj();
		ConcreteNotifier notifier = new ConcreteNotifier();
		notifier.addListener(observerObj, "changeState", null, null);
		
		System.out.println("============before change notifier's state=======");
		System.out.println("notifier state: " + notifier.getState().name());
		System.out.println("observerObj state: " + observerObj.getState().name());
		
		System.out.println("============now change notifier's state=======");
		notifier.changeState();

		System.out.println("notifier state: " + notifier.getState().name());
		System.out.println("observerObj state: " + observerObj.getState().name());
	}

}
