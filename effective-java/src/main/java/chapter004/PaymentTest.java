package main.java.chapter004;

import java.util.ArrayList;
import java.util.List;

public class PaymentTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("I");
		list.add(" am");
		list.add(" in");
		System.out.println(list);

		IPaymentObj obj = getPaymentObj(list);
		obj.add();
		System.out.println(list);
		
	}

	private static IPaymentObj getPaymentObj(List<String> list) {
		return new IPaymentObj() {
			
			@Override
			public void add() {
//				list = new ArrayList(); final变量不允许改变其引用的对象，但可以指向对象的属性，java8中可以不使用final修饰，但实际上也是final的
				list.add(" Beijing!");
			}
		};
	}

}
