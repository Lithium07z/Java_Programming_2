/*프로그램 작성일자: 2019.10.28
 *프로그램 설명: 표준 입력장치로 입력 받은 문자열을 역순으로 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.28
 */
package week9TestingPackage5;

import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ipString;
		
		while(true) {
			System.out.print("문자열 입력 : ");
			ipString = input.nextLine();
			if (ipString.equals("finish")) {
				System.out.println("프로그램 종료");
				break;
			} else { 
				System.out.println(reverseString(ipString));
				continue;
			}
		}
	}
	
	public static String reverseString(String s){
        return (new StringBuffer(s)).reverse().toString();
    }
}
