/*���α׷� �ۼ�����: 2019.11.07
 *���α׷� ����: ArrayList ����� �̿��� ������ �ذ��ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� �ۼ�����: 2019.11.07 PM 12:10
 */
package week11TestingPackage2;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListTest {
	public static void main(String[] args) {
		String[] s = { "���", "��", "�ٳ���" };
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
		
		list.add("����");
		list.add(2, "�ڸ�");
		System.out.println("----����Ʈ ���----");
		for (String temp : list) {
			System.out.println(temp + " ");
		}
		System.out.println("----------------");
		System.out.println("�ε��� 3 : " + list.get(3));
		list.set(2, "�޷�");
		list.add("��");
		System.out.println("�谡 ����� ��ġ :" + list.indexOf("��") );
		list.remove(3);
		System.out.println("----����Ʈ ���----");
		for (String temp : list) {
			System.out.println(temp + " ");
		}
		System.out.println("----------------");
	}
}
 