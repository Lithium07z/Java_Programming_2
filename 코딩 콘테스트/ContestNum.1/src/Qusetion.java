/*���α׷� �ۼ�����: 2019.11.23
 *���α׷� ����: 1�г� ����-1
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.23
 */
import java.util.Scanner;

public class Qusetion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int total = 0;
		int sNum;
		int loop = 1;
		int loop2 = 0;

		System.out.print("�̸��� �Է��ϼ���:");
		name = input.next();
		System.out.print("�Է��� ������ ������ �Է��ϼ���:");
		sNum = input.nextInt();
		int score[] = new int [sNum];
		while(loop <= sNum) {
			System.out.print(loop + "��° �����Է�:");
			score[loop - 1] = input.nextInt();
			loop += 1;
		}
		System.out.println("����� �̸���:" + name);
		switch(loop2+1) {
		case 1:
			while(loop2 != sNum) {
				System.out.print((loop2 + 1) + "��° ����:" + score[loop2] + " ");
				total += score[loop2];
				loop2 += 1;
			}
			break;
		}
		System.out.println("\n������:" + total);
		System.out.println("�����:" + total/sNum);
		if (total/sNum >= 90) {
			System.out.println("������:A");
		}
	}
}
