package w12TestPack3;

class Account {
	int balance; // 잔액
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	int withdraw(int amount) throws Exception {
		if (balance < amount)
			// 현재 메소드에서 발생하는 예외 종류를 표시하는 throws 절
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}
	int deposit(int amount) throws Exception{
		if(amount < 0)
			throw new Exception("입금액이 음수 입니다.");
		balance += amount;
		return amount;
	}
}