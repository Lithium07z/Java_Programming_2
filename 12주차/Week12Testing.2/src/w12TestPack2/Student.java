package w12TestPack2;

class Student implements Comparable<Student> {
	int number;
	String name;

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return "학번 : " + number + "\t이름 : " + name + "\n";
	}

	public int compareTo(Student s) { // 재정의
		return this.number - s.number;
	}
}
