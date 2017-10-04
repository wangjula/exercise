package main.java.strategy.demo001;

public class CashRebateStrategy implements CashStrategy {

	private double discount;
	
	public CashRebateStrategy(double discount) {
		this.discount = discount;
	}

	@Override
	public double calculateMoney(double money) {
		return money * discount;
	}
}
