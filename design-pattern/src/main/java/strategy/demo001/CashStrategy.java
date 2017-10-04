package main.java.strategy.demo001;

/**
 * 策略模式封装算法，相互可以代替，上下文通过统一的调用方法维护其实例
 * 
 * @author wangjiuliang
 *
 */
public interface CashStrategy {
	double calculateMoney(double money);
}
