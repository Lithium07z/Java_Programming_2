public class Sugang {
	int check;
	int score;
	String name;
	String time;
	
	Sugang(int check, int score, String name, String time) {
		this.check = check; this.score = score; this.name = name; this.time = time;
	}
	
	void write() {
		System.out.println("���� : " + gubun() + "\n���� : " + name + "\n���� : " + score + "\n�����ð� : " + time);
	}
	
	String gubun() {
		if(check == 1) {
			return "����";
		} else if (check == 2) {
			return "����";
		} else {
			return "�ش� ����";
		}
	}
}
