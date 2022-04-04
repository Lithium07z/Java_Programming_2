class SalariedEmployee extends Person{
	private String name;
	private String number;
	private int money;
	SalariedEmployee(String name, String number, int money) {
		super(name, number); this.money = money; // ���� Ŭ������ �����ڸ� �޾� �ʱ�ȭ
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
	
	public String toString() { // ���� Ŭ������ toString���� �޾� ��� 
		return super.toString() + " ���� : " + money * 12;
	}
}