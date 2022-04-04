/*프로그램 작성일자: 2019.11.08
 *프로그램 설명: 회원가입, 탈퇴, 회원정보 출력 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.08 PM 09:49
 */
package week11TestingPackage8;

import java.util.*;
public class CustomerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mNum;
		String name;
		String id;
		
		while (true) {
			System.out.print("1:회원가입    2:회원탈퇴    3:모든 회원 정보 출력    4:종료 =====> ");
			mNum = input.nextInt();
			if (mNum == 1) {
				System.out.print("이름을 입력하세요 : ");
				name = input.next();
				System.out.print("아이디를 입력하세요 : ");
				id = input.next();
				CustomerManage.saveCustomer(new Customer(name, id));			
			} else if (mNum == 2) {
				System.out.print("아이디를 입력하세요 : ");
				id = input.next();
				if (CustomerManage.findID(id) == true) {
					System.out.println("삭제 되었습니다.");
					System.out.println("=====회원 정보를 출력합니다.=====");
					for(int i = 0; i < CustomerManage.list.size(); i++) {
						System.out.println(CustomerManage.list.get(i).toString());
					}
				} else {
					System.out.println("해당 아이디는 없습니다.");
				}				
			} else if (mNum == 3) {
				System.out.println("=====회원 정보를 출력합니다.=====");
				for(int i = 0; i < CustomerManage.list.size(); i++) {
					System.out.println(CustomerManage.list.get(i).toString());
				}
			} else if (mNum == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("해당 번호는 기능이 없습니다.");
			}
		}
	}
}
