package week10TestingPackage4;

class Box<T> { // T는 데이터 타입을 의미, < >안에 표기, generic
	private T data; // T 타입을 자료형으로 갖는 data 필드

	public Box(T data) { // T 타입을 형식매개변수로 사용
		this.data = data;
	}

	public void set(T data) {
		this.data = data;
	}

	public T get() {
		return data;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		// 다이아 몬드 생성자 호출 시 타입 인수 생략 가능 SE7 버전부터 적용
		Box<String> sg = new Box<>("Generic"); // 문자열을 저장하는 Box 클래스의 객체 생성
		Box<Integer> ig = new Box<Integer>(340); // 정수를 저장하는 Box 클래스의 객체
		System.out.println("<String>" + sg.get());
		System.out.println("<Integer>" + ig.get());
	}
}
