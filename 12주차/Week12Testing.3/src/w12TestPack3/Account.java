package w12TestPack3;

class Account {
	int balance; // �ܾ�
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	int withdraw(int amount) throws Exception {
		if (balance < amount)
			// ���� �޼ҵ忡�� �߻��ϴ� ���� ������ ǥ���ϴ� throws ��
			throw new Exception("�ܾ��� �����մϴ�.");
		balance -= amount;
		return amount;
	}
	int deposit(int amount) throws Exception{
		if(amount < 0)
			throw new Exception("�Աݾ��� ���� �Դϴ�.");
		balance += amount;
		return amount;
	}
}