package main.java.simplefactory.demo001;

public class CashNormal implements CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
