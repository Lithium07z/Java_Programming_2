class Mod extends Cal {  
	Mod(int a, int b, char op) {
		super(a, b, op); // 슈퍼 클래스의 생성자를 받음
	   }
	@Override // 재정의 함
	int calculate(int a, int b) {
		return a % b;
	}
	@Override // 재정의 함 
	public String toString() {
		return super.toString() + (calculate(a, b)); // 슈퍼 클래스로부터 받은 toString에 calculate 결과를 추가해 출력
	}
}