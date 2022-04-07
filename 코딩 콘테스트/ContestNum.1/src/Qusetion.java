/*프로그램 작성일자: 2019.11.23
 *프로그램 설명: 1학년 문제-1
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.23
 */
import java.util.Scanner;

public class Qusetion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int total = 0;
		int sNum;
		int loop = 1;
		int loop2 = 0;

		System.out.print("이름을 입력하세요:");
		name = input.next();
		System.out.print("입력할 성적의 갯수를 입력하세요:");
		sNum = input.nextInt();
		int score[] = new int [sNum];
		while(loop <= sNum) {
			System.out.print(loop + "번째 성적입력:");
			score[loop - 1] = input.nextInt();
			loop += 1;
		}
		System.out.println("당신의 이름은:" + name);
		switch(loop2+1) {
		case 1:
			while(loop2 != sNum) {
				System.out.print((loop2 + 1) + "번째 성적:" + score[loop2] + " ");
				total += score[loop2];
				loop2 += 1;
			}
			break;
		}
		System.out.println("\n총합은:" + total);
		System.out.println("평균은:" + total/sNum);
		if (total/sNum >= 90) {
			System.out.println("학점은:A");
		}
	}
}
