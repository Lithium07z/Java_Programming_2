/*���α׷� �ۼ�����: 2019.11.14
 *���α׷� ����: HashMap�� ����Ͽ� �ֻ����� 100�� ������ �� �ֻ��� ���� �󵵼��� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.14 PM 07:25
 */
package w12TestPack4;

import java.util.Map;
public class Answer1 {
public static void main(String args[]) {
Map<Integer, Integer> map;
       map=Count.count();  //�󵵼��� ����� HashMap�� ��ȯ�޾� ����
       System.out.println("Map�� ����� �󵵼��� ����մϴ�");
       Count.write(map);  //HashMap�� ����� ���� ���
	}
}
