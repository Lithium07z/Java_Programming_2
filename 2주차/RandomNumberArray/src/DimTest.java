// 프로그램 작성일자: 2019.09.05
// 프로그램 설명: 입력 받은 값만큼 배열을 생성하고 난수로 초기화 한 후 내용을 출력하는 프로그램
// 프로그램 작성자: 20195138 김준호
// 프로그램 최종 수정일자: 2019.09.05 PM 09:48
import java.util.Scanner; 

public class DimTest { // 실행 클래스 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner를 input이라는 이름으로 사용 
		Dim dm = new Dim(); // Dim 클래스를 dm이라는 이름으로 사용 
		int opNum; // 출력할 데이터의 인덱스 값 저장을 위한 변수 
		char check; // 정수형 배열인지 실수형 배열인지 구분하기 위한 변수 
		
		System.out.print("정수형 배열 크기를 입력하세요 : "); 
		dm.init(input.nextInt(), 'I'); // 입력받은 크기와 배열 타입을 Dim클래스의 init메소드 에게 보냄 
		System.out.print("\n\n실수형 배열 크기를 입력하세요 : "); 
		dm.init(input.nextInt(), 'd'); // 입력받은 크기와 배열 타입을 Dim클래스의 init메소드 에게 보냄 
		System.out.print("\n\n몇 번째 데이터를 출력하시겠습니까 ? >> ");
		opNum = input.nextInt();
		System.out.print("\n정수형 배열이면 'I', 실수형 배열이면 'd'를 입력하세요 >> ");
		check = input.next().charAt(0);
		if(check == 'I') {
			if(dm.isearch(opNum) == -1) {
				System.out.println("배열 범위를 초과하였습니다.");
				System.exit(0); // 시스템 종료
			}
			System.out.println(dm.isearch(opNum));
		} else if(check == 'd') {
			if(dm.dsearch(opNum) == -1) {
				System.out.println("배열 범위를 초과하였습니다.");
				System.exit(0); // 시스템 종료
			}
			System.out.printf("%6.2f", dm.dsearch(opNum)); // 소수점 2자릿수만 남기고 출력 
		} else {
			System.out.println("잘못 입력하였습니다.\n프로그램을 종료합니다.");
		}
	}
}
