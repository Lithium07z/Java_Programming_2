/*���α׷� �ۼ�����: 2019.09.26
 *���α׷� ����: ��� ������ ����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.09.26 PM 09:48
 */
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person ps;
		int check = 0;
		String name;
		while (check != 3) {
			System.out.println("1: Salaried ��ü ����, 2: Hour��ü ����, 3. ���� : ");
			check = input.nextInt();

			switch (check) {
			case 1:
				System.out.println("�̸�, ���, �޿��� �Է��ϼ��� : ");
				ps = new SalariedEmployee(input.next(), input.next(), input.nextInt());
				// �Է¹��� �������� psŬ������ �������� SalariedEmployeeŬ������ ����
				System.out.println(((SalariedEmployee)ps).toString());
				// SalariedEmployee�� ����ȯ�� psŬ������ toString�� ��� 
				break;
			case 2:
				System.out.println("�̸�, ���, �ð����ӱ�, �ð��� �Է��ϼ��� : ");
				ps = new HourEmployee(input.next(), input.next(), input.nextInt(), input.nextInt());
				// �Է¹��� �������� psŬ������ �������� HourEmployeeŬ������ ���� 
				System.out.println(((HourEmployee)ps).toString());
				// HourEmployee�� ����ȯ�� psŬ������ toString�� ��� 
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
			}
		}
	}
}