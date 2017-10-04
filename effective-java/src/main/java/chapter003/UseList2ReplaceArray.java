package main.java.chapter003;

import java.util.ArrayList;
import java.util.List;

public class UseList2ReplaceArray {

	public static <E> E reduceByArray(List<E> list, Function<E> f, E initVal) {
		@SuppressWarnings("unchecked")
		E[] snapshot = (E[]) list.toArray(); //内部锁定list，创建备份
		E result = initVal;
		for (E e : snapshot) {
			result = f.apply(result, e);
		}
		return result;
	}
	
	public static <E> E reduceByList(List<E> list, Function<E> f, E initVal) {
		List<E> snapshot;
		synchronized(list) {
			snapshot = new ArrayList<E>();
		}
		
		E result = initVal;
		for (E e : snapshot) {
			result = f.apply(result, e);
		}
		return result;
	}
}

interface Function<T> {
	T apply(T t1, T t2);
}
