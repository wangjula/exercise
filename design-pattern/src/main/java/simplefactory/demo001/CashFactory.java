package main.java.simplefactory.demo001;

/**
 * 简单工厂模式主要用于根据传参创建对应的对象，从而使对象的创建和使用分离
 * 
 * @author wangjiuliang
 *
 */
public class CashFactory {

	public static CashSuper createCashAccept(String type) {
		switch (type) {
		case "normal":
			return new CashNormal();
		case "discount":
			return new CashRebate(0.8);
		case "return":
			return new CashReturn(300, 100);
		default:
			return new CashNormal();
		}
	}
}
