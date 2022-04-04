// 프로그램 작성일자: 2019.09.05
// 프로그램 설명: 수강관련 정보들을 출력하는 프로그램 
// 프로그램 작성자: 20195138 김준호
// 프로그램 최종 수정일자: 2019.09.05 AM 11:51
import java.util.Scanner;

public class SugangTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Sugang obj = new Sugang(1, 3, "자바 프로그래밍2", "화, 목34");
		obj.write(); // write 메소드 호출 
	}
}
