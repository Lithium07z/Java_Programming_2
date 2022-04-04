/*프로그램 작성일자: 2019.11.28
 *프로그램 설명: 두 개의 바이트 스트림 파일을 비교하여 일치하는지를 검사하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.28 PM 09:46
 */
package w14TestPack5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualsByteStream {
	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		FileReader firstF = null;
		FileReader scondF = null;
		int check;
		int check2 = 0;
		int loop;

		System.out.print("첫번째 파일 명을 입력하세요 : ");
		String fileName1 = input.next();
		System.out.print("두번째 파일 명을 입력하세요 : ");
		String fileName2 = input.next();

		try {
			firstF = new FileReader(fileName1); // 파일 읽기
			scondF = new FileReader(fileName2); // 파일 읽기
			while ((check = firstF.read()) != -1) { // 파일에 남은 자료가 없을 때까지
				list.add(check); // list에 추가해 파일 내 자료의 길이를 저장
			}
			while ((check2 = scondF.read()) != -1) {
				list2.add(check2);
			}
			firstF.close(); // 지시자를 처음 위치로 초기화 해야 하므로 파일 닫음
			scondF.close(); // 지시자를 처음 위치로 초기화 해야 하므로 파일 닫음
			firstF = new FileReader(fileName1); // 다시 파일 읽기
			scondF = new FileReader(fileName2); // 다시 파일 읽기
			
			if (list.size() > list2.size()) { // 사이즈가 더 큰 파일을 기준으로 잡음
				loop = list.size();
			} else if (list.size() < list2.size()) {
				loop = list2.size();
			} else {
				loop = list.size();
			}
			
			while (loop != 0) {
				check = firstF.read();
				check2 = scondF.read();
				System.out.print((char) check + " : " + (char) check2 + "\n");
				if ((char) check != (char) check2) {
					System.out.println("내용이 서로 다른 파일입니다.");
					check = -1; // 내용이 다르면 check에 -1을 넣어 표시
					break;
				}
				loop -= 1;
			}
			if (list.size() == list2.size() && check != -1) {
				System.out.println("내용이 동일한 파일 입니다.");
				// 두 파일의 크기가 같고 check가 -1이 아니면 동일한 파일임
			}
		} finally {
			if (firstF != null)
				firstF.close(); // 파일 닫음
			if (scondF != null)
				scondF.close(); // 파일 닫음
		}
	}
}
