// ���α׷� �ۼ�����: 2019.09.05
// ���α׷� ����: ���� ���¸� ó���ϱ� ���� Ŭ������ �ۼ��ϰ� �׽�Ʈ�ϴ� ���α׷�
// ���α׷� �ۼ���: 20195138 ����ȣ
// ���α׷� ���� ��������: 2019.09.05 AM 11:18
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		Account obj = new Account("����ȣ", 20000); // Account Ŭ������ obj��� �̸����� ���, �⺻�� ����
		
		System.out.println(obj); 
		System.out.println("10000���� �Ա��մϴ�.");
		obj.dePosit(10000); // dePosit �޼ҵ忡 �� ���� 
		System.out.println("�Ա� �� �ܾ� : " + obj.getBalance() + "\n"); // getter �޼ҵ�� �� ���޹���
		System.out.println("5000���� ����մϴ�.");
		obj.withDraw(5000); // withDraw �޼ҵ忡 �� ����
		System.out.println("��� �� �ܾ� : " + obj.getBalance() + "\n"); // getter �޼ҵ�� �� ���޹���
		System.out.println(obj);
	}
}
