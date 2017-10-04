package main.java.strategy.demo001;

public class CashNormalStrategy implements CashStrategy {
	
	@Override
	public double calculateMoney(double money) {
		return money;
	}

}
