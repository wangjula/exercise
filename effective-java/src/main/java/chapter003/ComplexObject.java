package main.java.chapter003;

public class ComplexObject {

	private boolean boolVal;
	private byte byteVal;
	private char charVal;
	private short shortVal;
	private int intVal;
	private long longVal;
	private float floatVal;
	private double doubleVal;
	private int hashCode;
	@Override
	public int hashCode() {
		int result = hashCode;
		if (result == 0) {
			result = 17;
			result = 31 * result + (boolVal? 1 : 0);
			result = 31 * result + (int) byteVal;
			result = 31 * result + (int) charVal;
			result = 31 * result + (int) shortVal;
			result = 31 * result + intVal;
			result = 31 * result + (int) (longVal^(longVal>>>32));
			result = 31 * result + Float.floatToIntBits(floatVal);
			long f = Double.doubleToLongBits(doubleVal);
			result = 31 * result + (int) (f^(f>>>32));
			hashCode = result;
		}
		return hashCode;
	}
	public boolean isBoolVal() {
		return boolVal;
	}
	public void setBoolVal(boolean boolVal) {
		this.boolVal = boolVal;
	}
	public byte getByteVal() {
		return byteVal;
	}
	public void setByteVal(byte byteVal) {
		this.byteVal = byteVal;
	}
	public char getCharVal() {
		return charVal;
	}
	public void setCharVal(char charVal) {
		this.charVal = charVal;
	}
	public int getIntVal() {
		return intVal;
	}
	public void setIntVal(int intVal) {
		this.intVal = intVal;
	}
	public short getShortVal() {
		return shortVal;
	}
	public void setShortVal(short shortVal) {
		this.shortVal = shortVal;
	}
	public long getLongVal() {
		return longVal;
	}
	public void setLongVal(long longVal) {
		this.longVal = longVal;
	}
	public float getFloatVal() {
		return floatVal;
	}
	public void setFloatVal(float floatVal) {
		this.floatVal = floatVal;
	}
	public double getDoubleVal() {
		return doubleVal;
	}
	public void setDoubleVal(double doubleVal) {
		this.doubleVal = doubleVal;
	}
	
}
