/*���α׷� �ۼ�����: 2019.11.08
 *���α׷� ����: ȸ������, Ż��, ȸ������ ��� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.08 PM 09:49
 */
package week11TestingPackage8;

import java.util.*;
public class CustomerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mNum;
		String name;
		String id;
		
		while (true) {
			System.out.print("1:ȸ������    2:ȸ��Ż��    3:��� ȸ�� ���� ���    4:���� =====> ");
			mNum = input.nextInt();
			if (mNum == 1) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				name = input.next();
				System.out.print("���̵� �Է��ϼ��� : ");
				id = input.next();
				CustomerManage.saveCustomer(new Customer(name, id));			
			} else if (mNum == 2) {
				System.out.print("���̵� �Է��ϼ��� : ");
				id = input.next();
				if (CustomerManage.findID(id) == true) {
					System.out.println("���� �Ǿ����ϴ�.");
					System.out.println("=====ȸ�� ������ ����մϴ�.=====");
					for(int i = 0; i < CustomerManage.list.size(); i++) {
						System.out.println(CustomerManage.list.get(i).toString());
					}
				} else {
					System.out.println("�ش� ���̵�� �����ϴ�.");
				}				
			} else if (mNum == 3) {
				System.out.println("=====ȸ�� ������ ����մϴ�.=====");
				for(int i = 0; i < CustomerManage.list.size(); i++) {
					System.out.println(CustomerManage.list.get(i).toString());
				}
			} else if (mNum == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
			}
		}
	}
}
