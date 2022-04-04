class Student extends Person {
	private String num;
	private int grade;
	
	Student(String name, int age, String num, int grade) {
		super(name, age); this.num = num; this.grade = grade;
	}
	
	void setNum(String num) {
		this.num = num;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	void disPlay() {
		super.disPlay(); 
		System.out.println(" 학번 : " + num + " 자바성적 : " + grade);
	}
}
