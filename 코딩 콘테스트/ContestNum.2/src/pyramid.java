/*���α׷� �ۼ�����: 2019.11.24
 *���α׷� ����: 1�г� ����-2
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 20198.11.24
 */
import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width = 1;
		int check = -1;
		int loop;

		while (check == -1) {
			System.out.println("�Ƕ�̵� �ٴ� �����Է�(Ȧ����):");
			width = input.nextInt();
			if (width % 2 == 0) {
				System.out.println("Ȧ�����Է°���");
				continue;
			} else {
				check += 1;
			}
		}
		loop = (width + 1) / 2;
		for (int i = 0; i < loop; i++) {
		    for (int j = 1; j < loop - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
