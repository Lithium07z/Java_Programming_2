/*프로그램 작성일자: 2019.09.26
 *프로그램 설명: 사원 정보를 출력하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.26 PM 09:48
 */
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person ps;
		int check = 0;
		String name;
		while (check != 3) {
			System.out.println("1: Salaried 객체 생성, 2: Hour객체 생성, 3. 종료 : ");
			check = input.nextInt();

			switch (check) {
			case 1:
				System.out.println("이름, 사번, 급여를 입력하세요 : ");
				ps = new SalariedEmployee(input.next(), input.next(), input.nextInt());
				// 입력받은 정보들을 ps클래스를 재정의한 SalariedEmployee클래스로 전달
				System.out.println(((SalariedEmployee)ps).toString());
				// SalariedEmployee로 형변환한 ps클래스의 toString문 출력 
				break;
			case 2:
				System.out.println("이름, 사번, 시간당임금, 시간을 입력하세요 : ");
				ps = new HourEmployee(input.next(), input.next(), input.nextInt(), input.nextInt());
				// 입력받은 정보들을 ps클래스를 재정의한 HourEmployee클래스로 전달 
				System.out.println(((HourEmployee)ps).toString());
				// HourEmployee로 형변환한 ps클래스의 toString문 출력 
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}
}