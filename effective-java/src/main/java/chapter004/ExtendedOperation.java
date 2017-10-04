package main.java.chapter004;

public enum ExtendedOperation implements IOperation {

	EXP("^") {
		public double apply(double x, double y) {
			return Math.pow(x, y);
		}
	},
	
	REMAINDER("%") {
		public double apply(double x, double y) {
			return x % y;
		}
	};
	
	private final String symbol;
	
	private ExtendedOperation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}
}
