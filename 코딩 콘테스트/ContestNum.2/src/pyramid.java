/*프로그램 작성일자: 2019.11.24
 *프로그램 설명: 1학년 문제-2
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 20198.11.24
 */
import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width = 1;
		int check = -1;
		int loop;

		while (check == -1) {
			System.out.println("피라미드 바닥 숫자입력(홀수만):");
			width = input.nextInt();
			if (width % 2 == 0) {
				System.out.println("홀수만입력가능");
				continue;
			} else {
				check += 1;
			}
		}
		loop = (width + 1) / 2;
		for (int i = 0; i < loop; i++) {
		    for (int j = 1; j < loop - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
