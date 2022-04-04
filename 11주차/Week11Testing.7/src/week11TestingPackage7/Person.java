package week11TestingPackage7;

public class Person {
	private String name;
	private int height;
	Person(String name, int height) {
		this.name = name; this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String toString() {
		return "Person [name = " + this.name + ", height=" + this.height+ "]";
	}
}
