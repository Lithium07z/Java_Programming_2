package w15TestPack2;

import java.io.Serializable;

class PetRecord implements Serializable {
	String name; // �̸�
	int age; // ����
	double weight;// ������

	public PetRecord(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	void disPlay() {
		System.out.println("Name = " + name + "\n" + "Age = " + age + "\n" + "Weight = " + weight);
	}
}