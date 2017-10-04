package main.java.delegate.demo001;

import java.lang.reflect.Method;

public class Event {

	private Object obj;
	
	private String methodName;
	
	private Object[] params;
	
	private Class<?>[] paramTypes;
	
	public Event(Object obj, String methodName, Object[] params, Class<?>[] paramTypes) {
		this.obj = obj;
		this.methodName = methodName;
		this.params = params;
		this.paramTypes = paramTypes;
	}
	
	public void invoke() {
		try {
			Method m = obj.getClass().getMethod(methodName, paramTypes);
			m.invoke(obj, params);
		} catch (Exception e) {
			throw new RuntimeException("invoke method error",e);
		}
	}
	
}
