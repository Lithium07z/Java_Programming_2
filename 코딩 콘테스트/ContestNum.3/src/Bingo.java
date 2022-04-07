/*프로그램 작성일자: 2019.11.24
 *프로그램 설명: 1학년 문제-3
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.24
 */

import java.util.Scanner;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int rNum = random.nextInt(10) + 1;
		int ipNum;
		
		System.out.println("[빙고게임]");
		System.out.println("기회는 총 5번입니다.");
		System.out.println("숫자의 범위는 1-10 입니다.");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 기회: ");
			ipNum = input.nextInt();
			if (ipNum > rNum) {
				System.out.println("숫자가 큽니다.");
			} else if (ipNum < rNum) {
				System.out.println("숫자가 작습니다.");
			} else if (ipNum == rNum) {
				System.out.println("[ 빙고 ]");
				break;
			}
		}		
	}
}
