class Menu {
	protected String name; // 메뉴명
	protected int count; // 수량
	Menu(String name, int count) {
		this.name = name; this.count = count; 
	}
	
	void write() { // 객체 정보를 출력하는 메소드 
		System.out.print("메뉴 : " + name + "    수량 : " + count + "    단가 : ");
	}
	
	int getTotal() { // 총 주문금액을 반환하는 메소드
		return count;
	}
}
