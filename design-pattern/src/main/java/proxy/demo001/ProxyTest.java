package main.java.proxy.demo001;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RealSubject rs = new RealSubject();
		rs.request();
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		Proxy proxy = new Proxy(rs);//可以使用其他方法创建代理，避免客户端与真正的实体耦合
		proxy.request();
	}

}
