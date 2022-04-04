/*���α׷� �ۼ�����: 2019.11.28
 *���α׷� ����: �� ���� ����Ʈ ��Ʈ�� ������ ���Ͽ� ��ġ�ϴ����� �˻��ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.28 PM 09:46
 */
package w14TestPack5;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualsByteStream {
	public static void main(String[] args) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		FileReader firstF = null;
		FileReader scondF = null;
		int check;
		int check2 = 0;
		int loop;

		System.out.print("ù��° ���� ���� �Է��ϼ��� : ");
		String fileName1 = input.next();
		System.out.print("�ι�° ���� ���� �Է��ϼ��� : ");
		String fileName2 = input.next();

		try {
			firstF = new FileReader(fileName1); // ���� �б�
			scondF = new FileReader(fileName2); // ���� �б�
			while ((check = firstF.read()) != -1) { // ���Ͽ� ���� �ڷᰡ ���� ������
				list.add(check); // list�� �߰��� ���� �� �ڷ��� ���̸� ����
			}
			while ((check2 = scondF.read()) != -1) {
				list2.add(check2);
			}
			firstF.close(); // �����ڸ� ó�� ��ġ�� �ʱ�ȭ �ؾ� �ϹǷ� ���� ����
			scondF.close(); // �����ڸ� ó�� ��ġ�� �ʱ�ȭ �ؾ� �ϹǷ� ���� ����
			firstF = new FileReader(fileName1); // �ٽ� ���� �б�
			scondF = new FileReader(fileName2); // �ٽ� ���� �б�
			
			if (list.size() > list2.size()) { // ����� �� ū ������ �������� ����
				loop = list.size();
			} else if (list.size() < list2.size()) {
				loop = list2.size();
			} else {
				loop = list.size();
			}
			
			while (loop != 0) {
				check = firstF.read();
				check2 = scondF.read();
				System.out.print((char) check + " : " + (char) check2 + "\n");
				if ((char) check != (char) check2) {
					System.out.println("������ ���� �ٸ� �����Դϴ�.");
					check = -1; // ������ �ٸ��� check�� -1�� �־� ǥ��
					break;
				}
				loop -= 1;
			}
			if (list.size() == list2.size() && check != -1) {
				System.out.println("������ ������ ���� �Դϴ�.");
				// �� ������ ũ�Ⱑ ���� check�� -1�� �ƴϸ� ������ ������
			}
		} finally {
			if (firstF != null)
				firstF.close(); // ���� ����
			if (scondF != null)
				scondF.close(); // ���� ����
		}
	}
}
