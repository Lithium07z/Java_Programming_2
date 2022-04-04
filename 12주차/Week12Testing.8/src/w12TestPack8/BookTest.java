/*프로그램 작성일자: 2019.11.14
 *프로그램 설명: Book 클래스 이용하여 Book 정보를 ArrayList에 저장하고, 저장된 모든 데이터를 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.16 PM 07:05
 */
package w12TestPack8;

import java.util.*;

public class BookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		String ipBookT;
		String ipBookN;
		String ipBookA;
		int mNum;
		int cNum = 0;

		while(true) {
			System.out.print("메뉴 : ");
			mNum = input.nextInt();
			switch (mNum) {
			case 1:
				System.out.println("저장할 자료의 제목을 입력하세요 : ");
				ipBookT = input.next();
				System.out.println("저장할 자료의 저자를 입력하세요 : ");
				ipBookA = input.next();
				System.out.println("저장할 자료의 관리번호를 입력하세요 : ");
				ipBookN = input.next();
				list.add(cNum, new Book(ipBookN, ipBookT, ipBookA , false));
				cNum += 1;
				continue;
			case 2:
				System.out.println("대출하려는 자료의 제목을 입력하세요 :");
				ipBookT = input.next();
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getTitle().equals(ipBookT)) {
						list.get(j).rentBook();
					}
				}
				continue;
			case 3:
				System.out.println("검색하려는 자료의 제목을 입력하세요 :");
				ipBookT = input.next();
				for (int k = 0; k < list.size(); k++) {
					if (list.get(k).getTitle().equals(ipBookT)) {
						System.out.println(list.get(k).toString());
					}
				}
				continue;
			case 4:
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).toString());
				}
				continue;
			case 5:
				System.out.println("삭제하려는 자료의 관리번호를 입력하세요 : ");
				ipBookN = input.next();
				for (int l = 0; l < list.size(); l++) {
					if (list.get(l).getNumber().equals(ipBookN)) {
						list.remove(l);
					}
				}
				continue;
			case 6: 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
