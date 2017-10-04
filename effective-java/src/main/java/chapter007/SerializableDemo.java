package main.java.chapter007;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {

}

final class StringList implements Serializable {

	/**
	 * UID
	 */
	private static final long serialVersionUID = 6398399055520409401L;
	
	private transient int size = 0;//防止默认的序列化，只使用自动的writeObject方法序列化
	
	private transient Entry head = null;
	
	private static class Entry {
		String data;
		Entry next;
		Entry pervious;
	}
	
	public final void add(String s) {
		if (head == null) {
			head = new Entry();
			head.pervious = null;
			head.data = s;
			head.next = null;
		} else {
			Entry newEntry = new Entry();
			newEntry.pervious = head.pervious;
			newEntry.data = s;
			newEntry.next = head;
			head.pervious = newEntry;
			head = newEntry;
		}
		size ++;
	}
	
	/**
	 * Serialize this {@code StringList} instance
	 * 
	 * @serialData The size of the list (the number of strings it contains)
	 * is emitted ({@code int}), followed by all of its elements  (each a {@code String}),
	 * in the proper sequence
	 * @param s
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream s) throws IOException {//自定义序列化形式，当物理表示和逻辑表示不一致的时候需要使用
		s.defaultWriteObject();
		s.writeInt(size);
		for (Entry e = head; e != null; e = e.next) {
			s.writeObject(e.data);
		}
	}
	
	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		s.defaultReadObject();
		int numElement = s.readInt();
		for (int i = 0; i < numElement; i ++) {
			add((String)s.readObject());
		}
	}
}
