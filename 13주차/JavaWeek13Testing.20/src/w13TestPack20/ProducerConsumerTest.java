/*���α׷� �ۼ�����: 2019.11.23
 *���α׷� ����: �۽���, ������ �����尡 ���ʷ� �޽����� �۽�, �����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.23 PM 09:46
 */
package w13TestPack20;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread pro = new Thread(new Producer(buffer));
		Thread con = new Thread(new Consumer(buffer));
		pro.start(); // ������ ������ ����
		con.start(); // �Һ��� ������ ����
	}
}