package w12TestPack6;

class Person {
	private String name; // 이름
	private String num; // 전화번호

	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String toString() {
		return " [이름 : " + name + ",  전화번호 : " + num + "]";
	}
}
