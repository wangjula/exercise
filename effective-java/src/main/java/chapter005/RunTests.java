package main.java.chapter005;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
	
	public static void doRun(Class<?> c) {
		int test = 0;
		int pass = 0;
		
		for (Method m : c.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				test ++;
				try {
					m.invoke(null);
					pass ++;
				} catch (InvocationTargetException warapedExc) {
					Throwable exc = warapedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("INVALID @Test: " + m);
				}
			}
		}
		System.out.printf("Passed: %d, Failed: %d%n", pass, test - pass);
	}
	
	public static void doRunException(Class<?> c) {
		int test = 0;
		int pass = 0;
		
		for (Method m : c.getDeclaredMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				test ++;
				try {
					m.invoke(null);
				} catch (InvocationTargetException warppedExc) {
					Throwable exc = warppedExc.getCause();
					Class<? extends Exception> excType = m.getAnnotation(Test.class).value();
					if (excType.isInstance(exc)) {
						pass ++;
					} else {
						System.out.printf("Test %s failed: expected %s, got %s%n", m, excType.getName(), exc);
					}
				} catch (Exception e) {
					System.out.printf("INVALID @Test: " + m);
				} 
			}
		}
		System.out.printf("Passed: %d, Failed: %d%n", pass, test - pass);
	}

	public static void main(String[] args) {
		doRunException(ExceptionProvider.class);
	}

}
