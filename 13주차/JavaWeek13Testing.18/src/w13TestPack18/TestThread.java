/*프로그램 작성일자: 2019.11.21
 *프로그램 설명: 특수 문자와 영문자를 출력하는 스레드를 작성하고 테스트 하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.22 PM 07:22
 */
package w13TestPack18;

import java.util.Random;
public class TestThread {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread1());
		Thread th2 = new Thread(new Thread2());
		th1.start();
		th2.start();
	}
}

class Thread1 implements Runnable {
	public void run() {
		Random randomS = new Random();
		char[] cymbol = {'＃', '＆', '＊', '＠', '§', '※', '☆', '★', '○', '●', '◎', '◇', '◆', '□', '■'};
		int numS;
		for (int j = 0; j < 15; j++) {
			numS = randomS.nextInt(15);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println("프로그램이 중지되었습니다.");
			}
			System.out.println("Nomal1 : " + cymbol[numS]);
		}
	}
}

class Thread2 implements Runnable {
	public void run() {
		Random randomE = new Random();
		char english;
		int num;
		for (int i = 0; i < 10; i++) {
			num = randomE.nextInt(122);
			if (num < 97 || num > 122) {
				i -= 1;
				continue;
			}
			english = (char)num;
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println("프로그램이 중지되었습니다.");
			}
			System.out.println("Nomal2 : " + english);
		}
	}
}