package main.java.chapter001;

import main.java.utils.StringUtils;

public class FruitStaticFactory {

	private static final String PACKAGE_PATH = "main.java.chapter001";
	
	public static IFruit getInstance(String type) {
		if (StringUtils.isEmpty(type)) {
			return null;
		}
		
		IFruit fruit = null;
		try {
			fruit = (IFruit) Class.forName(PACKAGE_PATH+"." + StringUtils.upperCaseFirst(type)).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return fruit;
	}
}
