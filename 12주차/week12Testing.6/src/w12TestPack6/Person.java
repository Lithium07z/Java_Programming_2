package w12TestPack6;

class Person {
	private String name; // �̸�
	private String num; // ��ȭ��ȣ

	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String toString() {
		return " [�̸� : " + name + ",  ��ȭ��ȣ : " + num + "]";
	}
}
