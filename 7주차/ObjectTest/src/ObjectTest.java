/*���α׷� �ۼ�����: 2019.10.10
 *���α׷� ����: �������̽��� �̿��� �� ��ü ������ �� �� ���� Ű�� ū ����� ����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.10 PM 09:01
 */
public class ObjectTest {
	public static void main(String[] args) {
		Person[] p = {new Person("����", 178.0), new Person("�浿", 185.0), new Person("ȫ��", 180.0)};
		for (Person temp : p) { // �� ��ü ���� ��� ��� 
			System.out.println(temp.toString());
		}
		System.out.println("Ű�� ���� ū ��� : " + getMaximum(p)); 
	}
	
	static Person getMaximum(Person[] array) {
		Person max = array[0]; // �ϴ� ù��° ���� �ִ� ������ ������ ����
		for (int i = 0; i < array.length; i++) {
			if (max.compareTo(array[i]) == -1) { // max ��ü�� compareTo�� ���� ��ü�� �־� Ű ���� ���� �� ��ȯ ���� -1 �̸�
				max = array[i]; // max�� �ش� ��ü ���� 
			}
		}
		return max; // max ��ü ��ȯ 
	}
}

interface Comparable {
	int compareTo(Object per);
}