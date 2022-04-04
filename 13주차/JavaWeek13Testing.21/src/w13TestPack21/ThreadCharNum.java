/*프로그램 작성일자: 2019.11.24
 *프로그램 설명: 생성된 난수 만큼 문자와 숫자를 번갈아 출력하는 스레드 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.24 PM 03:03
 */
package w13TestPack21;

public class ThreadCharNum {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 45 + 1);
		int num2 = (int) (Math.random() * 10 + 1);
		Buffer buffer = new Buffer();

		Thread cht = new Thread(new CharThread(new char[] { '◇', '□' }, num1, buffer));
		Thread nut = new Thread(new NumThread(num2, num1, buffer));

		cht.start();
		nut.start();
	}
}
