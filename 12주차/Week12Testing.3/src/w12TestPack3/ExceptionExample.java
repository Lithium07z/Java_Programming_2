package w12TestPack3;

public class ExceptionExample {
	public static void error(String str) {
		System.out.println(str + "예외를 정상 처리 하였습니다 ");
	}
	public static void main(String args[]) {
		Account obj = new Account();
		try {
			int amount = obj.withdraw(100000000); // 예외 발생 메소드
			System.out.println("인출액:" + amount);
		} catch (Exception e) { // 발생된 예외 처리
			String msg = e.getMessage(); // 오류 메시지 출력
			System.out.println(msg);
			error("인출 ");
		}
		System.out.println(obj);
		try {
			int amount = obj.deposit(-100); // 예외 발생 메소드
			System.out.println("입금액:" + amount);
		} catch (Exception e) { // 발생된 예외 처리
			String msg = e.getMessage(); // 오류 메시지 출력
			System.out.println(msg);
			error("입금");
		}
		System.out.println(obj);
	}
}
