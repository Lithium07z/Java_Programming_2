/*프로그램 작성일자: 2019.10.24
 *프로그램 설명: 함수형 인터페이스와 람다식을 이용해 전자기기를 재생, 중단 시키는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.24 PM 12:17
 */
package week9TestingPackage3;

import java.util.Scanner;
public class interfaceTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int check = 0;
		String product = null;
		FPlay fp = (pd) -> System.out.println(pd + "를 재생합니다.");
		FStop fs = (pd) -> System.out.println(pd + "를 중단합니다.");
		
		while(check != 4 ) {
			System.out.println("기기를 선택하세요 ");
			System.out.println("1: MP3 2: CDPlay 3: WindowMediaPlay 4: 종료 ==> ");
			check = input.nextInt();
			if (check == 1) {
					product = "MP3";
			} else if (check == 2) {
					product = "CDPlay";
			} else if (check == 3) {
					product = "WindowMediaPlay";
			} else if (check == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("해당 번호는 기능이 없습니다.");
			}		
			System.out.println("해당 기기에 대한 동작을 선택하세요");
			System.out.println("1: Play 2: Stop ==> ");
			check = input.nextInt();
			if (check == 1) {
				fp.play(product);
			} else if (check == 2) {
				fs.stop(product);
			} else {
				System.out.println("해당 번호는 기능이 없습니다.");
			}
		}
	}
}

@FunctionalInterface
interface FPlay{
	void play(String str);
}

@FunctionalInterface
interface FStop{
	void stop(String str);
}
