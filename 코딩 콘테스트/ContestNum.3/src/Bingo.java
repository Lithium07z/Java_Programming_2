/*���α׷� �ۼ�����: 2019.11.24
 *���α׷� ����: 1�г� ����-3
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.24
 */

import java.util.Scanner;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int rNum = random.nextInt(10) + 1;
		int ipNum;
		
		System.out.println("[�������]");
		System.out.println("��ȸ�� �� 5���Դϴ�.");
		System.out.println("������ ������ 1-10 �Դϴ�.");
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "��° ��ȸ: ");
			ipNum = input.nextInt();
			if (ipNum > rNum) {
				System.out.println("���ڰ� Ů�ϴ�.");
			} else if (ipNum < rNum) {
				System.out.println("���ڰ� �۽��ϴ�.");
			} else if (ipNum == rNum) {
				System.out.println("[ ���� ]");
				break;
			}
		}		
	}
}
