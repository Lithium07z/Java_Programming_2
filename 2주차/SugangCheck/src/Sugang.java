public class Sugang {
	int check;
	int score;
	String name;
	String time;
	
	Sugang(int check, int score, String name, String time) {
		this.check = check; this.score = score; this.name = name; this.time = time;
	}
	
	void write() {
		System.out.println("구분 : " + gubun() + "\n과목 : " + name + "\n학점 : " + score + "\n수업시간 : " + time);
	}
	
	String gubun() {
		if(check == 1) {
			return "전공";
		} else if (check == 2) {
			return "교양";
		} else {
			return "해당 없음";
		}
	}
}
