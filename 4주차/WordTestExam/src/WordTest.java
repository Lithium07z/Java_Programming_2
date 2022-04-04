/*프로그램 작성일자: 2019.09.21
 *프로그램 설명: 보드로 영 단어를 입력하면 단어 뜻을 한글로 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.21
 */
import java.util.Scanner;

public class WordTest {
	public static void main(String[] args) {
		Word str[] = { new Word("one", "하나"), new Word("student", "학생"), new Word("apple", "사과"),
					new Word("school", "학교"), new Word("flower", "꽃"), new Word("bus", "버스"),
					new Word("drum", "드럼"), new Word("chicken", "치킨"), new Word("song", "노래"),
					new Word("game", "게임")};
		Scanner in = new Scanner(System.in);
		WordProcess wp = new WordProcess(str);
		
		int check = 0;
		char exit = 'c';
		String word;
		char cWord;
		while (exit != 'F' && exit != 'f') {
			System.out.print(">> 1. 단어찾기 2. 문자로 시작하는 단어 찾기 : ");
			check = in.nextInt();
			if (check == 1) {
				System.out.print(">> 찾고자 하는 단어를 입력하세요 : ");
				word = in.next();
				System.out.println(WordProcess.search(word));
			} else if (check == 2) {
				System.out.print("문자를 입력하세요 : ");
				cWord = in.next().charAt(0);
				WordProcess.search(cWord);
			}
			System.out.print(">> 찾는 작업을 중단하려면 F 또는 f를 입력하세요 : ");
			exit = in.next().charAt(0);
		}
	}
}
