// ���α׷� �ۼ�����: 2019.09.05
// ���α׷� ����: �Է� ���� ����ŭ �迭�� �����ϰ� ������ �ʱ�ȭ �� �� ������ ����ϴ� ���α׷�
// ���α׷� �ۼ���: 20195138 ����ȣ
// ���α׷� ���� ��������: 2019.09.05 PM 09:48
import java.util.Scanner; 

public class DimTest { // ���� Ŭ���� 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner�� input�̶�� �̸����� ��� 
		Dim dm = new Dim(); // Dim Ŭ������ dm�̶�� �̸����� ��� 
		int opNum; // ����� �������� �ε��� �� ������ ���� ���� 
		char check; // ������ �迭���� �Ǽ��� �迭���� �����ϱ� ���� ���� 
		
		System.out.print("������ �迭 ũ�⸦ �Է��ϼ��� : "); 
		dm.init(input.nextInt(), 'I'); // �Է¹��� ũ��� �迭 Ÿ���� DimŬ������ init�޼ҵ� ���� ���� 
		System.out.print("\n\n�Ǽ��� �迭 ũ�⸦ �Է��ϼ��� : "); 
		dm.init(input.nextInt(), 'd'); // �Է¹��� ũ��� �迭 Ÿ���� DimŬ������ init�޼ҵ� ���� ���� 
		System.out.print("\n\n�� ��° �����͸� ����Ͻðڽ��ϱ� ? >> ");
		opNum = input.nextInt();
		System.out.print("\n������ �迭�̸� 'I', �Ǽ��� �迭�̸� 'd'�� �Է��ϼ��� >> ");
		check = input.next().charAt(0);
		if(check == 'I') {
			if(dm.isearch(opNum) == -1) {
				System.out.println("�迭 ������ �ʰ��Ͽ����ϴ�.");
				System.exit(0); // �ý��� ����
			}
			System.out.println(dm.isearch(opNum));
		} else if(check == 'd') {
			if(dm.dsearch(opNum) == -1) {
				System.out.println("�迭 ������ �ʰ��Ͽ����ϴ�.");
				System.exit(0); // �ý��� ����
			}
			System.out.printf("%6.2f", dm.dsearch(opNum)); // �Ҽ��� 2�ڸ����� ����� ��� 
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.\n���α׷��� �����մϴ�.");
		}
	}
}
