package main.java.proxy.demo001;

/**
 * 代理的用途主要是：</br>
 * 1. 远程代理，隐藏一个对象存在不同地址空间的事实 </br>
 * 2. 虚拟代理，用于存放代价高昂的是实例 </br>
 * 3. 安全代理，控制客户端对真实对象的访问 </br>
 * 4. 智能指引，用于增加或修改额外的处理逻辑 </br>
 * @author wangjiuliang
 *
 */
public class Proxy implements Subject {
	
	private RealSubject realSubject;
	
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void request() {
		realSubject.request();
	}

}
