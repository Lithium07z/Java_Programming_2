class Nade extends Menu {
	private boolean syrup; // 시럽 추가 유무
	Nade(String name, int count, boolean syrup) {
		super(name, count); this.syrup = syrup; // 슈퍼 클래스의 생성자를 전달받고 syrup인자 추가
	}
	
	@Override // 재정의함
	void write() {
		super.write(); // 슈퍼 클래스의 write 메소드를 사용
		if (name.equals("레모네이드") && syrup == false) {
			System.out.println("3500    금액 : " + count * 3500 + "\n추가 사항: 시원한 음료");
		} else if (name.equals("레모네이드") && syrup == true) {
			System.out.println("3500    금액 : " + count * 3500 + "\n추가 사항: 따뜻한 음료");
		} else if (name.equals("케모마일") && syrup == false){
			System.out.println("4000    금액 : " + count * 4000 + "\n추가 사항: 시원한 음료");
		} else if (name.equals("케모마일") && syrup == true){
			System.out.println("4000    금액 : " + count * 4000 + "\n추가 사항: 따뜻한 음료");
		}
	}
	
	@Override // 재정의함
	int getTotal() {
		if (name.equals("레모네이드")) {
			return count * 3500;
		} else if (name.equals("케모마일")) {
			return count * 4000;
		} else {
			return -1;
		}
			
	}
}
