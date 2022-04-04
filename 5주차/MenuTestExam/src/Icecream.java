class Icecream extends Menu{
	private int choice; // 추가 사항의 과일을 구분하는 변수
	Icecream(String name, int count, int choice) {
		super(name, count);  this.choice = choice; // 슈퍼 클래스의 생성자를 전달받고 syrup인자 추가
	}
	@Override // 재정의함
	void write() {
		super.write(); // 슈퍼 클래스의 write 메소드 사용
		if (choice == 1) {
			System.out.println("5000    금액 : " + count * 5000 + "\n추가 사항: 바닐라");
		} else if (choice == 2) {
			System.out.println("5000    금액 : " + count * 5000 + "\n추가 사항: 블루베리");
		} else if (choice == 3) {
			System.out.println("5000    금액 : " + count * 5000 + "\n추가 사항: 바나나");
		}
	}
	
	@Override // 재정의 함
	int getTotal() {
		return count * 5000;
	}
}
