package main.java.chapter002;

public class ClassedStudentBuilder {

	private int classNO;
	
	private String className;
	
	private String name;
	
	private int age;
	
	public ClassedStudentBuilder(int classNo, String className) {
		this.classNO = classNo;
		this.className = className;
	}
	
	public ClassedStudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public ClassedStudentBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public Student builder() {
		return new Student(this);
	}
	
	public String getClassName() {
		return className;
	}

	public int getClassNO() {
		return classNO;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

class Student {

	private int classNo;
	
	private String className;
	
	private String name;
	
	private int age;
	
	public Student(ClassedStudentBuilder builder) {
		this.classNo = builder.getClassNO();
		this.className = builder.getClassName();
		this.name = builder.getName();
		this.age = builder.getAge();
	}
	
	@Override
	public String toString() {
		return "ClassNo: " + classNo + "\nClassName: " + className + "\nName: " + name + "\nAge: " + age;
	}
}
