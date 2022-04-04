// 프로그램 작성일자: 2019.09.05
// 프로그램 설명: 은행 계좌를 처리하기 위한 클래스를 작성하고 테스트하는 프로그램
// 프로그램 작성자: 20195138 김준호
// 프로그램 최종 수정일자: 2019.09.05 AM 11:18
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Account obj = new Account("김준호", 20000); // Account 클래스를 obj라는 이름으로 사용, 기본값 전달
		
		System.out.println(obj); 
		System.out.println("10000원을 입금합니다.");
		obj.dePosit(10000); // dePosit 메소드에 값 전달 
		System.out.println("입금 후 잔액 : " + obj.getBalance() + "\n"); // getter 메소드로 값 전달받음
		System.out.println("5000원을 출금합니다.");
		obj.withDraw(5000); // withDraw 메소드에 값 전달
		System.out.println("출금 후 잔액 : " + obj.getBalance() + "\n"); // getter 메소드로 값 전달받음
		System.out.println(obj);
	}
}
