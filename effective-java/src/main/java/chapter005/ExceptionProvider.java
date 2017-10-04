package main.java.chapter005;

public class ExceptionProvider {

	@Test(value = RuntimeException.class)
	public static void method1() {
		throw new RuntimeException("m1");
	}
	
	@Test(value = MsrException.class)
	public static void method2() {
		throw new MsrRuntimeException();
	}
	
	@Test(value = MsrRuntimeException.class)
	public static void method3() {
		throw new MsrException();
	}
}
