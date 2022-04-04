/*프로그램 작성일자: 2019.09.30
 *프로그램 설명: 카페 주문 및 주문내역 출력 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.30 PM 09:22
 */
import java.util.Scanner;

public class MenuTest {
	public static int menu(Scanner key) {
		String menu = "1. 아메리카노     2. 카페라떼   3.레모네이드    4.케모마일   5.와플  6. 종료  --> ";
		System.out.print(menu);
		return key.nextInt();
	}

	public static int count(Scanner key, String message) {
		System.out.print(message + " --> ");
		return key.nextInt();
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Menu[] menu=new Menu[10];
		boolean  b;
		int hap = 0, t, i=0;
		
		while (true) {
			int choice = menu(key);
			if(choice == 6)
				break;
			int cnt = count(key, "수량을 입력하세요 : ");

			switch (choice) {
			case 1:
				b = count(key, "1. 시럽추가  2.시럽추가 없음") == 1 ? true : false;
				menu[i++] = new Coffee("아메리카노", cnt, b);
				break;
			case 2:
				b = count(key, "1. 시럽추가  2.시럽추가 없음") == 1 ? true : false;
				menu[i++] = new Coffee("카페라떼", cnt, b);
				break;
			case 3:
				b = count(key, "1. 따뜻한 음료  2. 시원한 음료") == 1 ? true : false;
				menu[i++] = new Nade("레모네이드", cnt, b);
				break;
			case 4:
				b = count(key, "1. 따뜻한 음료  2. 시원한 음료") == 1 ? true : false;
				menu[i++] = new Nade("케모마일", cnt, b);
				break;
			case 5:
				t = count(key, "1. 바닐라  2. 블루베리 3. 바나나");
				menu[i++] = new Icecream("와플", cnt, t);
				break;
			default:
				System.out.println("잘못 입력하였습니다");
			}
			
		}
		System.out.println("\n주문하신 총 내역을 출력합니다");
		for(int j=0; j<i;j++) {
			menu[j].write();
			hap += menu[j].getTotal();
		}
		System.out.println("총 금액 : " + hap);
		System.out.println("프로그램을 종료합니다");
	}
}