class Person {
	protected String name;
	protected int age;
	
	Person(String name, int age) {
		this.name = name; this.age = age;
	}
	
	void disPlay() {
		System.out.print("이름 : " + name + " 나이 : " + age);
	}
}
