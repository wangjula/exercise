package main.java.composite.demo001;

/**
 * 组合模式：用树状结构表示“部分-整体”的层次结构，以便部分和整体保持一致性，共有类似的逻辑</br>
 * 
 * <b>使用场合：</b>需求中体现部分和整体的关系，希望用户可以以统一的方式访问整体和部分，复用逻辑，就应该考虑使用组合模式</br>
 * @author wangjiuliang
 *
 */
public class CompositeTest {

	public static void main(String[] args) {
		Component root = new Composite("root");
		root.add(new Leaf("Leaf-A"));
		root.add(new Leaf("Leaf-B"));
		
		Component c = new Composite("Leaf-C");
		root.add(c);
//		root.remove(c);
		
		Component x = new Composite("X");
		x.add(new Leaf("Leaf-XA"));
		x.add(new Leaf("Leaf-XB"));
		
		root.add(x);
		root.display(1);
	}
	
}
