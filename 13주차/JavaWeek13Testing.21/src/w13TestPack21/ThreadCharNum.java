/*���α׷� �ۼ�����: 2019.11.24
 *���α׷� ����: ������ ���� ��ŭ ���ڿ� ���ڸ� ������ ����ϴ� ������ ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.24 PM 03:03
 */
package w13TestPack21;

public class ThreadCharNum {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 45 + 1);
		int num2 = (int) (Math.random() * 10 + 1);
		Buffer buffer = new Buffer();

		Thread cht = new Thread(new CharThread(new char[] { '��', '��' }, num1, buffer));
		Thread nut = new Thread(new NumThread(num2, num1, buffer));

		cht.start();
		nut.start();
	}
}
