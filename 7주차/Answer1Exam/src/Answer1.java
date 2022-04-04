/*프로그램 작성일자: 2019.10.10
 *프로그램 설명: 동물마다 다른 울음소리를 출력하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.10 AM 11:11
 */
interface Soundable{
 
	String sound();
}

class Cat implements Soundable { // Soundable 인퍼페이스를 구현하는 Cat 클래스 
	public String sound() { // 인터페이스의 sound 추상 메소드를 구현 
		return "야옹";
	}
}

class Dog implements Soundable { // Soundable 인터페이스를 구현하는 Dog 클래스 
	public String sound() { // 인터페이스의 sound 추상 메소드를 구현 
		return "멍멍";
	}
}

public class Answer1 {
	private static void printSound(Soundable sd) {
		System.out.println(sd.sound());
	}
	public static void main(String[] args) {
		System.out.println("소리를 출력합니다");
		printSound(new Cat());
		printSound(new Dog());
	}
}

