// 프로그램 작성일자: 2019.09.05
// 프로그램 설명: 원 둘레와 원 넓이를 계산하는 프로그램 
// 프로그램 작성자: 20195138 김준호
// 프로그램 최종 수정일자: 2019.09.05 AM 11:32
import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle cir = new Circle(); // Circle 클래스를 cir이라는 이름으로 사용 
		
		double radi; // 반지름 변수
		int choice; // 번호 선택 변수
		
		System.out.print("반지름을 입력하세요 >>> ");
		radi = input.nextDouble();
		System.out.print("1. 넓이, 2. 원둘레 >> 선택 : ");
		choice = input.nextInt();
		if(choice == 1) {
			cir.getArea(radi); // getArea에 입력받은 반지름 전달
		}
		else if(choice == 2) {
			cir.getCircum(radi); // getCircum에 입력받은 반지름 전달 
		}
		else {
			System.out.println("해당 메뉴 없음"); // 예외 경우처리 
		}
	}
}
