class SalariedEmployee extends Person{
	private String name;
	private String number;
	private int money;
	SalariedEmployee(String name, String number, int money) {
		super(name, number); this.money = money; // 슈퍼 클래스의 생성자를 받아 초기화
	}
	String getName() {
		return this.name;
	}
	String getNumber() {
		return this.number;
	}
	int getMoney() {
		return this.money;
	}
	void setName(String name) {
		this.name = name;
	}
	void setNumber(String number) {
		this.number = number;
	}
	void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	int computeSalary() {
		return money * 12;
	}
	
	public String toString() { // 슈퍼 클래스의 toString문을 받아 사용 
		return super.toString() + " 연봉 : " + money * 12;
	}
}