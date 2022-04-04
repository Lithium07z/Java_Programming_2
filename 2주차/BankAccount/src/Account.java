public class Account {
	private String name;
	private int balance;
	
	Account(String name, int balance) {
		this.name = name; this.balance = balance;
	}
	
	void dePosit(int money) {
		balance += money; // ���� ����ŭ �ܾ׿��� �߰�
	}
	
	void withDraw(int money) {
		balance -= money; // ���� ����ŭ �ܾ׿��� ��
	}
	
	int getBalance() {
		return this.balance; // AccountŬ������ �ܾװ��� ��ȯ
	}
	
	public String toString() {
		return "_______��ü ���� ���_______\n" + "�̸� : " + name + "   �ܾ� : " + balance + "\n";
	}
}
