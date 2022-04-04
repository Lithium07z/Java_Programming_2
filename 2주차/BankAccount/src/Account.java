public class Account {
	private String name;
	private int balance;
	
	Account(String name, int balance) {
		this.name = name; this.balance = balance;
	}
	
	void dePosit(int money) {
		balance += money; // 받은 값만큼 잔액에서 추가
	}
	
	void withDraw(int money) {
		balance -= money; // 받은 값만큼 잔액에서 뺌
	}
	
	int getBalance() {
		return this.balance; // Account클래스의 잔액값을 반환
	}
	
	public String toString() {
		return "_______객체 내용 출력_______\n" + "이름 : " + name + "   잔액 : " + balance + "\n";
	}
}
