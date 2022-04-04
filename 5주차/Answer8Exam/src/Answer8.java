/*프로그램 작성일자: 2019.09.30
 *프로그램 설명: 고객 정보와 학생 정보를 받아 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호 
 *프로그램 최종 수정일자: 2019.10.03 PM 04:18
 */
import java.util.*;

public class Answer8 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Person ps[] = new Person[5];
		
		int choice = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("1: Customer 객체, 2: Student 객체 ==>");
			choice = key.nextInt();
			if(choice == 1) {
				ps[i] = new Customer(input("이름을 입력하세요 : ", key), digit("나이를 입력하세요 : ", key), 0, "g");
				((Customer)ps[i]).setGubun(input("고객구분을 입력하세요 : ", key));
				((Customer)ps[i]).setPoint(digit("포인트를 입력하세요 : ", key));
				
			} else if (choice == 2) {
				ps[i] = new Student(input("이름을 입력하세요 : ", key), digit("나이를 입력하세요 : ", key), "0", 0);
				((Student)ps[i]).setNum(input("학번을 입력하세요 : ", key));
				((Student)ps[i]).setGrade(digit("점수를 입력하세요 : ", key));
			} else {
				System.out.println("해당 번호의 기능은 존재하지 않습니다. ");
			}
		}

		System.out.println("\n==== 객체 내용 출력 ====");
		for (Person s : ps) {
			s.disPlay(); // 모든 객체의 정보를 출력하게 함 
			if (s instanceof Customer) { // s객체가 Customer 객체인 경우에만
				((Customer)s).addPoint(500); // Customer 객체의 포인트를 500 추가
			}
		}

		System.out.println("\n==== Customer 객체만 출력 ====");
		for (int j = 0; j < ps.length; j++) {
			if (ps[j] instanceof Customer) { // ps[j]객체가 Customer 객체인 경우에만
				ps[j].disPlay(); // 객체 정보 출력 
			}
		}
	}
	
		static String input(String str, Scanner Key) {
			System.out.print(str);
			return Key.next();
		}
		
		static int digit(String str, Scanner key) {
			System.out.print(str);
			return key.nextInt();
		}	
}