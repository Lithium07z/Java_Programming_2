package w12TestPack2;

class Student implements Comparable<Student> {
	int number;
	String name;

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return "�й� : " + number + "\t�̸� : " + name + "\n";
	}

	public int compareTo(Student s) { // ������
		return this.number - s.number;
	}
}
