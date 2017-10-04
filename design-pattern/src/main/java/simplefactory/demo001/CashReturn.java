package main.java.simplefactory.demo001;

public class CashReturn implements CashSuper {
	
	private double moneyCondition;
	
	private double moneyReturn;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(double money) {
		return money - Math.floor(money / moneyCondition) * moneyReturn;
	}

}
