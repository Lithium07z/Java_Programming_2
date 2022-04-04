class Coffee extends Menu {
	private boolean syrup; // 시럽의 추가 유무
	Coffee(String name, int count, boolean syrup) {
		super(name, count); this.syrup = syrup; // 슈퍼 클래스의 생성자를 전달받고 syrup인자 추가
	}
	
	@Override // 재정의함
	void write() {
		super.write(); // 슈퍼 클래스의 write 메소드를 사용
		if (name.equals("아메리카노") && syrup == false) {
			System.out.println("2500    금액 : " + count * 2500 + "\n추가 사항: 시럽 추가 없음");
		} else if (name.equals("아메리카노") && syrup == true) {
			System.out.println("2500    금액 : " + count * 2500 + "\n추가 사항: 시럽 추가 있음");
		} else if (name.equals("카페라떼") && syrup == false){
			System.out.println("3000    금액 : " + count * 3000 + "\n추가 사항: 시럽 추가 없음");
		} else if (name.equals("카페라떼") && syrup == true){
			System.out.println("3000    금액 : " + count * 3000 + "\n추가 사항: 시럽 추가 있음");
		}
	}
	
	@Override // 재정의함
	int getTotal() {
		if (name.equals("아메리카노")) {
			return count * 2500;
		} else if (name.equals("카페라떼")) {
			return count * 3000;
		} else {
			return -1;
		}
			
	}
}
