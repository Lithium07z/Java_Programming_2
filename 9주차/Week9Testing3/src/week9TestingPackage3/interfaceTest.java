/*���α׷� �ۼ�����: 2019.10.24
 *���α׷� ����: �Լ��� �������̽��� ���ٽ��� �̿��� ���ڱ�⸦ ���, �ߴ� ��Ű�� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.24 PM 12:17
 */
package week9TestingPackage3;

import java.util.Scanner;
public class interfaceTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int check = 0;
		String product = null;
		FPlay fp = (pd) -> System.out.println(pd + "�� ����մϴ�.");
		FStop fs = (pd) -> System.out.println(pd + "�� �ߴ��մϴ�.");
		
		while(check != 4 ) {
			System.out.println("��⸦ �����ϼ��� ");
			System.out.println("1: MP3 2: CDPlay 3: WindowMediaPlay 4: ���� ==> ");
			check = input.nextInt();
			if (check == 1) {
					product = "MP3";
			} else if (check == 2) {
					product = "CDPlay";
			} else if (check == 3) {
					product = "WindowMediaPlay";
			} else if (check == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			} else {
				System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
			}		
			System.out.println("�ش� ��⿡ ���� ������ �����ϼ���");
			System.out.println("1: Play 2: Stop ==> ");
			check = input.nextInt();
			if (check == 1) {
				fp.play(product);
			} else if (check == 2) {
				fs.stop(product);
			} else {
				System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
			}
		}
	}
}

@FunctionalInterface
interface FPlay{
	void play(String str);
}

@FunctionalInterface
interface FStop{
	void stop(String str);
}
