// ���α׷� �ۼ�����: 2019.09.05
// ���α׷� ����: �� �ѷ��� �� ���̸� ����ϴ� ���α׷� 
// ���α׷� �ۼ���: 20195138 ����ȣ
// ���α׷� ���� ��������: 2019.09.05 AM 11:32
import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle cir = new Circle(); // Circle Ŭ������ cir�̶�� �̸����� ��� 
		
		double radi; // ������ ����
		int choice; // ��ȣ ���� ����
		
		System.out.print("�������� �Է��ϼ��� >>> ");
		radi = input.nextDouble();
		System.out.print("1. ����, 2. ���ѷ� >> ���� : ");
		choice = input.nextInt();
		if(choice == 1) {
			cir.getArea(radi); // getArea�� �Է¹��� ������ ����
		}
		else if(choice == 2) {
			cir.getCircum(radi); // getCircum�� �Է¹��� ������ ���� 
		}
		else {
			System.out.println("�ش� �޴� ����"); // ���� ���ó�� 
		}
	}
}
