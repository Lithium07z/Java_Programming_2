/*���α׷� �ۼ�����: 2019.11.07
 *���α׷� ����: ���� ���� 1�� �������� ArrayList�� ��ü�� ������ ���� �� �� ������������ ����� �� �ֵ��� ������ ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.10. PM 09:05
 */
package week11TestingPackage7;

import java.util.ArrayList;
public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<Person> alist = new ArrayList<>();
		
		ListExam.add(alist, new Person("����", 179));
		ListExam.add(alist, new Person("�µ�", 173));
		ListExam.add(alist, new Person("�α�", 183));
		ListExam.add(alist, new Person("���", 180));
		ListExam.write(alist);
    }
}
