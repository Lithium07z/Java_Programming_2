/*���α׷� �ۼ�����: 2019.11.22
 *���α׷� ����: ���ٽ��� �̿��� Ư�� ���ڿ� �����ڸ� ����ϴ� �����带 �ۼ��ϰ� �׽�Ʈ �ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.22 08:02
 */
package w13TestPack19;

import java.util.Random;

public class TestThread {
	public static void main(String[] args) {
		new Thread1().run();
		new Thread2().run();
		}
}

class Thread1 implements Runnable{
	public void run() {
		Random randomS = new Random();
		char[] cymbol = { '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��', '��' };
		Runnable threadC = () -> {
			int numS;
			for (int j = 0; j < 15; j++) {
				numS = randomS.nextInt(15);
				try {
					Thread.sleep(500);
				} catch (InterruptedException ie) {
					System.out.println("���α׷��� �����Ǿ����ϴ�.");
				}
				System.out.println("Nomal1 : " + cymbol[numS]);
			}
		};
		new Thread(threadC).start();
	}
}

class Thread2 implements Runnable {
	public void run() {
		Random randomE = new Random();
		Runnable threadS = () -> {
			char english;
			int num;
			for (int i = 0; i < 10; i++) {
				num = randomE.nextInt(122);
				if (num < 97 || num > 122) {
					i -= 1;
					continue;
				}
				english = (char) num;
				try {
					Thread.sleep(500);
				} catch (InterruptedException ie) {
					System.out.println("���α׷��� �����Ǿ����ϴ�.");
				}
				System.out.println("Nomal2 : " + english);
			}
		};
		new Thread(threadS).start();
	}
}
