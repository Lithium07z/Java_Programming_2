/*���α׷� �ۼ�����: 2019.11.14
 *���α׷� ����: HashMap�� �̿���  ������ �ּҷ��� ó���ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.14 PM 09:03
 */
package w12TestPack6;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class NumberBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, Person> person = new HashMap<String, Person>();
		person.put("Lithium", new Person("����ȣ", "010-0000-0000"));
		person.put("SoftWare", new Person("����ȣ", "010-1111-1111"));
		person.put("Computer", new Person("�豤ȣ", "010-2222-2222"));
		String id;
		
		while(true) {
			System.out.print("id�� �Է��ϼ��� : ");
			id = input.next();
			if (person.containsKey(id) == true) {
				System.out.println(person.get(id));
				break;
			} else {
				System.out.println("�ش� id�� �������� �ʽ��ϴ�.");
				continue;
			}
		}
		Set<Map.Entry<String, Person>> set = person.entrySet();
		for (Entry<String, Person> et : set) {
			System.out.println(et);
		}
	}
}
