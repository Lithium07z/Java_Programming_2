/*���α׷� �ۼ�����: 2019.10.31
 *���α׷� ����: ���� ���� ��ƿ��Ƽ ���̺귯���� ����Ͽ� ���õ� ���ó�� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.03 PM 05:44
 */
package week10TestingPackage9;

public class Answer4 {
	public static void main(String[] args) {
		Manage manage = new Manage();
		manage.splitString(new String[] { "������ȣ : ", "���ýĺ���ȣ : ", "������ ��ȣ : " }, "082-2-777-5566");
		manage.dateWrite();
		manage.startChar();
		System.out.println("34 + 56 - 12 * 2 = " + manage.calChar("34 + 56 - 12 * 2"));
		System.out.println("���α׷� ����");
	}
}