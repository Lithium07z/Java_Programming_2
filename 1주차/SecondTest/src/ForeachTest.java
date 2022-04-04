// 프로그램 작성일자: 2019.08.29
// 프로그램 설명: 크기가 10인 문자 배열을 표준 입력 장치로 입력 받은 값으로 초기한 후 다음과 같이 출력하는 프로그램
// 프로그램 작성자: 20195138 김준호 
// 프로그램 최종 수정일자: 2019.08.29 PM 02:20
import java.util.Scanner; // 키보드로부터 입력받기 위해 사용 

public class ForeachTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ct[] = new char[10]; // 문자 데이터를 받아 저장하는 배열 
		
		System.out.println("문자 데이터를 입력하세요 "); // 데이터 입력을 알림 
		for(int i = 0; i < ct.length; i++) { // 배열의 크기만큼 반복 
			System.out.print(i+1 + "번째 : "); // 몇 번째 문자를 입력중인지 알림 
			ct[i] = input.next().charAt(0); // 입력받은 문자를 배열에 저장 
		}
		
		System.out.println("=== 배열 원소 출력 : 변환 전 "); // 변환 전 배열 원소 출력을 알림 
		for(char cto : ct) { // 배열의 값을 char자료형을 가지는 cto에 차례로 저장
			System.out.print(cto + " "); // cto값을 출력 
		}
		 for(int i = 0; i < ct.length; ++i){ // 배열의 크기만큼 반복 
			 if(65 <= ct[i] && ct[i] <= 90){ // 배열 내 문자의 아스키코드가 65 이상이면서 90이하인지 검사 
				 ct[i] = (char)(ct[i] + 32); // 조건에 만족하면 아스키코드 값 32를 더하고 char자료형으로 바꾼 뒤 배열에 다시 저장
				 continue; // 다음으로 넘어감 
	           	}
			 if (97 <= ct[i] && ct[i] <= 122){ // 배열 내 문자의 아스키코드가 97 이상이면서 122이하인지 검사
				 ct[i] = (char)(ct[i] - 32); // 조건에 만족하면 아스키코드 값 32를 빼고 char자료형으로 바꾼 뒤 배열에 다시 저장
				 continue; // 다음으로 넘어감 
	         	}
		 }
		 System.out.println("\n=== 배열 원소 출력 : 변환 후 "); // 변환 후 배열 원소 출력을 알림 
		 for(char cto2 : ct) { // 배열의 값을 char자료형을 가지는 cto2에 차례로 저장 
			 System.out.print(cto2 + " "); // cto2값을 출력 
		 }
		}
}
