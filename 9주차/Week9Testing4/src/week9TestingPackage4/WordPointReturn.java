/*프로그램 작성일자: 2019.10.24
 *프로그램 설명: 초기화된 문자열에서 표준 입력 장치로 입력된 문자가 몇 번째 있는지 위치 값을 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.24 PM 12:31
 */
package week9TestingPackage4;

import java.util.Scanner;
public class WordPointReturn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str= "자바 프로그램은 재미 없습니다. 어렵습니다";
		String istr;
		
		System.out.println("문자를 입력하세요 : ");
		istr = input.next();
		if (str.indexOf(istr) == -1) {
			System.out.println(istr + "는(은) 해당 문자열에 없습니다." );
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		System.out.println(istr + "는(은)" + (str.indexOf(istr) + 1) + "번째에 있습니다." );
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}
