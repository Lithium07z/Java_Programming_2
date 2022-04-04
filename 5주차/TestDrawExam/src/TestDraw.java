/*프로그램 작성일자: 2019.09.28
 *프로그램 설명: 각형과 삼각형, 사다리꼴 도형 중 사용자가 선택한 도형을 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.29 PM 06.38
 */
import java.util.Scanner;

public class TestDraw {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShapeDraw sd;
		
		int check = 0;
		int line = 0;
		char shape;
		System.out.print("1. Rectangle 2. Triangle 3. Ladder 4. Finish\n메뉴를 입력하세요 : ");
		check = input.nextInt();
		if (check == 1) {
			System.out.print("행크기를 입력하세요 : ");
			line = input.nextInt();
			System.out.print("문자를 입력하세요 : ");
			shape = input.next().charAt(0);
			sd = new Rectangle(); // Rectangle타입의 sd클래스를 생성
			sd.draw(line, shape); // 재정의된 draw메소드로 변수 전달
		} else if (check == 2) {
			System.out.print("행크기를 입력하세요 : ");
			line = input.nextInt();
			System.out.print("문자를 입력하세요 : ");
			shape = input.next().charAt(0);
			sd = new Triangle(); // Triangle타입의 sd클래스를 생성
			sd.draw(line, shape); // 재정의된 draw메소드로 변수 전달
		} else if (check == 3) {
			System.out.print("행크기를 입력하세요 : ");
			line = input.nextInt();
			System.out.print("문자를 입력하세요 : ");
			shape = input.next().charAt(0);
			sd = new Ladder(); // Ladder타입의 sd클래스를 생성
			sd.draw(line, shape); // 재정의된 draw메소드로 변수 전달
		} else if (check == 4) {
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("해당 번호의 기능은 존재하지 않습니다. ");
		}
	}
}
