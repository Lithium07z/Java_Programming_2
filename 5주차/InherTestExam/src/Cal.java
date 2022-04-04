abstract class Cal { // 각 클래스에서 공통되는 부분을 수퍼클래스로 정의, 추상클래스
	protected int a, b; // 연산을 위한 피 연산자
	protected char op; // 연산자

	Cal(int a, int b, char op) {
		this.a = a; this.b = b; this.op = op;
	}

	abstract int calculate(int a, int b); // 추상 메소드이기 때문에 몸체가 없음

	public String toString() {
		return "[ result ] " + a + " " + op + " " + b + " = ";
	}
}