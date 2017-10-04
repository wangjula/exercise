package main.java.simplefactory.demo001;

public class CashRebate implements CashSuper {
	
	private double moneyRebate = 1.0D;
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}
	
	@Override
	public double acceptCash(double money) {
		return moneyRebate * money;
	}

}
