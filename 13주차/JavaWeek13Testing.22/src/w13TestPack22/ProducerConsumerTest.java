/* 2019.11.21 
 * �ڹ� ���α׷���2 13���� ���� ���� 5�� ���� 
 * ������ �����ļ� ���� ���������� �ۼ��� 
 */
package w13TestPack22;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread pro = new Thread(new Producer(buffer));
		Thread con = new Thread(new Consumer(buffer));
		pro.start(); // ������ ������ ����
		con.start(); // �Һ��� ������ ����
	}
}