/*프로그램 작성일자: 2019.09.26
 *프로그램 설명: 프린트 토너와 잉크량을 출력하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.26 AM 11:41
 */
public class Answer1 {
	public static void main(String[] args) {
		Inkjet_P inkject = new Inkjet_P("한림시리즈", "한림","usb", 500, 1000);
		Laser_P laser = new Laser_P("융합시리즈", "융합", "port1", 1000, 3000);
		inkject.print();
		laser.print();
		System.out.println("잉크를 350 소비합니다");
		if(inkject.inkdec(350) == 0)
			System.out.println("잉크 잔량이 부족합니다");
		else
			inkject.print();
		
		System.out.println("토너를 5000 소비합니다");
		if(laser.inkdec(5000) == 0)
			System.out.println("토너 잔량이 부족합니다");
		else
			laser.print();
	}
}