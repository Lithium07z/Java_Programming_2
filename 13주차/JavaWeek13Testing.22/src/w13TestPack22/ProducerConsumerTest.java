/* 2019.11.21 
 * 자바 프로그래밍2 13주차 내용 점검 5번 문제 
 * 못보고 지나쳐서 가장 마지막으로 작성함 
 */
package w13TestPack22;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread pro = new Thread(new Producer(buffer));
		Thread con = new Thread(new Consumer(buffer));
		pro.start(); // 생산자 스레드 시작
		con.start(); // 소비자 스레드 시작
	}
}