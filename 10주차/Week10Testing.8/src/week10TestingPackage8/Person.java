package week10TestingPackage8;

class Person implements Comparable<Person> {
private String name;
private double height;

	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	@Override
	public int compareTo(Person p) {
		return new Double(height).compareTo(p.getHeight());
	}
}