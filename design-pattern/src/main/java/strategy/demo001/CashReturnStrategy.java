package main.java.strategy.demo001;

public class CashReturnStrategy implements CashStrategy {

	private double returnMoney;
	
	private double returnCondition;
	
	public CashReturnStrategy(double returnMoney, double returnCondition) {
		this.returnMoney = returnMoney;
		this.returnCondition = returnCondition;
	}

	@Override
	public double calculateMoney(double money) {
		return money - Math.floor(money / returnCondition) * returnMoney;
	}
}
