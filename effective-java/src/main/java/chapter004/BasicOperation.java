package main.java.chapter004;

public enum BasicOperation implements IOperation {

	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}

	},
	
	TIMES("*") {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	
	DIVIDE("/") {
		public double apply(double x, double y) {
			return x / y;
		}
	};
	
	private final String symbol;
	
	private BasicOperation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}

}
