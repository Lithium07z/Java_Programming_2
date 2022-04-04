interface Action{
	void work();
}
public class Answer {
	public static void main(String[] args) {
		Action action = new Action() {
			public void work() { // 인터페이스 내 추상메소드 구현 
				System.out.println("무명클래스로 인터페이스를 구현");
				System.out.println("무명 객체로 work() 메소드를 호출합니다.");
			}
		}; // 무명 클래스 구현
		action.work();
	}
}