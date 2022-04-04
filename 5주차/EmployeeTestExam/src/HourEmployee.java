class HourEmployee extends Person {  
	private String name;
	private String number;
	private int moneyT;
	private int time;
	HourEmployee(String name, String number, int moneyT, int time) {
		super(name, number); this.moneyT = moneyT; this.time = time; // 슈퍼 클래스의 생성자를 받아 초기화
	}
	String getName() {
		return this.name;
	}
	String getNumber() {
		return this.number;
	}
	int getMoney() {
		return this.moneyT;
	}
	int getTime() {
		return this.time;
	}
	void setName(String name) {
		this.name = name;
	}
	void setNumber(String number) {
		this.number = number;
	}
	void setMoney(int moneyT) {
		this.moneyT = moneyT;
	}
	void setTime(int time) {
		this.time = time;
	}
	@Override
	int computeSalary() {
		return moneyT * time;
	}
	
	public String toString() { // 슈퍼 클래스의 toString문을 받아 사용 
		return super.toString() + " 시간당 임금 : " + moneyT +
				" 일한 시간 : " + time + " 금액 : " + moneyT * time;
	}
}