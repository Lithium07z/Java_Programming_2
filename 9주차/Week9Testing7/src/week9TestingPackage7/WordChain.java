/*프로그램 작성일자: 2019.10.29
 *프로그램 설명: 끝말 잇기 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 작성일자: 2019.10.29
 */
package week9TestingPackage7;

import java.util.Scanner;
import java.util.Random;
public class WordChain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String[] wPack = {"금수저", "저장", "장난감", "감나무", "무기", "생강", "술병", "산책", "강아지", "강산"};
		String iWord;
		String sWord;
		char again;
		int rNum;
		
		rNum = random.nextInt(10);
		sWord = wPack[rNum].substring(wPack[rNum].length() - 1);
		
		sWhile:
		while(true) {
			System.out.println("끝말 잇기 게임을 시작합니다~~~");
			System.out.print(wPack[rNum] + "의 " + sWord + "로 시작하는 단어 >> ");
			iWord = input.next();
			
			while(true) {
			if (iWord.equals("c")) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			} else if (iWord.substring(0, 1).equals(sWord) == false) {
				System.out.print("틀렸습니다. \n계속하겠습니까? >> ");
				again = input.next().charAt(0);
				if (again == 'c') {
					rNum = random.nextInt(10);
					sWord = wPack[rNum].substring(wPack[rNum].length() - 1);
					continue sWhile;
				} else {
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				}
			} else if (iWord.substring(0, 1).equals(sWord) == true ||
					   iWord.substring(0, 1).equals(sWord.substring(sWord.length() - 1)) == true) {
				System.out.print(iWord + "의 " + iWord.substring(iWord.length() - 1) + "로 시작하는 단어 >> ");
				sWord = iWord.substring(iWord.length() - 1);
				iWord = input.next();
				continue;
				}
			}
		}
	}
} 
