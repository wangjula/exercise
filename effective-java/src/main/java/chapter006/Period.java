package main.java.chapter006;

import java.util.Date;

public class Period {
	
	private Date start;
	
	private Date end;

	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());//初始化参数使用保护性拷贝，防止改变引用对象的本身
		this.end = new Date(end.getTime());//对于可以被不可信方子类的的类型，不要用它们的clone方法来实现保护性拷贝
		if (end.before(start)) {
			throw new IllegalArgumentException("start should not after end");
		}
	}

	public Date getStart() {
		return new Date(start.getTime());//返回的对象也使用保护性拷贝，防止给出指向内部对象的引用
	}
	
	public Date getEnd() {
		return new Date(end.getTime());//访问方法允许使用clone方法，因为明确知晓Period内部类型，但不建议使用
	}

}
