class HourEmployee extends Person {  
	private String name;
	private String number;
	private int moneyT;
	private int time;
	HourEmployee(String name, String number, int moneyT, int time) {
		super(name, number); this.moneyT = moneyT; this.time = time; // ���� Ŭ������ �����ڸ� �޾� �ʱ�ȭ
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
	
	public String toString() { // ���� Ŭ������ toString���� �޾� ��� 
		return super.toString() + " �ð��� �ӱ� : " + moneyT +
				" ���� �ð� : " + time + " �ݾ� : " + moneyT * time;
	}
}