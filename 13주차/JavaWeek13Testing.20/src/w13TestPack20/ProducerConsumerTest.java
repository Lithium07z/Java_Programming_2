/*프로그램 작성일자: 2019.11.23
 *프로그램 설명: 송신자, 수신자 스레드가 차례로 메시지를 송신, 수신하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.23 PM 09:46
 */
package w13TestPack20;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread pro = new Thread(new Producer(buffer));
		Thread con = new Thread(new Consumer(buffer));
		pro.start(); // 생산자 스레드 시작
		con.start(); // 소비자 스레드 시작
	}
}