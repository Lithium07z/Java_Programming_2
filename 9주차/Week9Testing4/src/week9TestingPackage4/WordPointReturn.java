/*���α׷� �ۼ�����: 2019.10.24
 *���α׷� ����: �ʱ�ȭ�� ���ڿ����� ǥ�� �Է� ��ġ�� �Էµ� ���ڰ� �� ��° �ִ��� ��ġ ���� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.24 PM 12:31
 */
package week9TestingPackage4;

import java.util.Scanner;
public class WordPointReturn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str= "�ڹ� ���α׷��� ��� �����ϴ�. ��ƽ��ϴ�";
		String istr;
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		istr = input.next();
		if (str.indexOf(istr) == -1) {
			System.out.println(istr + "��(��) �ش� ���ڿ��� �����ϴ�." );
			System.out.println("���α׷� ����");
			System.exit(0);
		}
		System.out.println(istr + "��(��)" + (str.indexOf(istr) + 1) + "��°�� �ֽ��ϴ�." );
		System.out.println("���α׷� ����");
		System.exit(0);
	}
}
