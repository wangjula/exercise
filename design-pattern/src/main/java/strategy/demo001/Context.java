package main.java.strategy.demo001;

public class Context {

	private CashStrategy cashStrategy;
	
	public Context(CashStrategy cashStrategy) {
		this.cashStrategy = cashStrategy;
	}
	
	public double getResult(double money) {
		return cashStrategy.calculateMoney(money);
	}
}
