/*���α׷� �ۼ�����: 2019.10.31
 *���α׷� ����: Ű�� �������� �����Ͽ� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.31 PM 09:42
 */
package week10TestingPackage8;

import java.util.Arrays;
import java.util.Scanner;
public class PersonOutPut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Person p1 = new Person("ȫ��", 180.0);
		Person p2 = new Person("���", 168.0);
		Person p3 = new Person("�μ�", 175.0);
		Person p4 = new Person("����", 170.0);
		Person[] pArr = { p1, p2, p3, p4};
		double[] hArr = new double[pArr.length]; 
		
		System.out.println("==== ���� �� ������ ====");
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].toString());
		}
		Arrays.sort(pArr); 
		
		System.out.println("==== ���� �� ������ ====");
		for(int k = 0; k < pArr.length; k++) {
			System.out.println(pArr[k].toString());
		}
	}
}
