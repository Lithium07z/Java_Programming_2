class Person {
	private String name;
	private String number;
	
	Person(String name, String number) {
		this.name = name; this.number = number;
	}
	
	String getName() {
		return this.name;
	}
	String getNumber() {
		return this.number;
	}
	void setName(String name) {
		this.name = name;
	}
	void setNumber(String number) {
		this.number = number;
	}

	int computeSalary() {
		return 0;
	}
	
	public String toString() {
		return "이름 : " + this.name + " 사번 : " + number;
	}
}
