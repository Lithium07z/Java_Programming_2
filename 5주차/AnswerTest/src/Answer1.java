/*���α׷� �ۼ�����: 2019.09.26
 *���α׷� ����: ����Ʈ ��ʿ� ��ũ���� ����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.09.26 AM 11:41
 */
public class Answer1 {
	public static void main(String[] args) {
		Inkjet_P inkject = new Inkjet_P("�Ѹ��ø���", "�Ѹ�","usb", 500, 1000);
		Laser_P laser = new Laser_P("���սø���", "����", "port1", 1000, 3000);
		inkject.print();
		laser.print();
		System.out.println("��ũ�� 350 �Һ��մϴ�");
		if(inkject.inkdec(350) == 0)
			System.out.println("��ũ �ܷ��� �����մϴ�");
		else
			inkject.print();
		
		System.out.println("��ʸ� 5000 �Һ��մϴ�");
		if(laser.inkdec(5000) == 0)
			System.out.println("��� �ܷ��� �����մϴ�");
		else
			laser.print();
	}
}