/*���α׷� �ۼ�����: 2019.10.10
 *���α׷� ����: �������� �ٸ� �����Ҹ��� ����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.10 AM 11:11
 */
interface Soundable{
 
	String sound();
}

class Cat implements Soundable { // Soundable �������̽��� �����ϴ� Cat Ŭ���� 
	public String sound() { // �������̽��� sound �߻� �޼ҵ带 ���� 
		return "�߿�";
	}
}

class Dog implements Soundable { // Soundable �������̽��� �����ϴ� Dog Ŭ���� 
	public String sound() { // �������̽��� sound �߻� �޼ҵ带 ���� 
		return "�۸�";
	}
}

public class Answer1 {
	private static void printSound(Soundable sd) {
		System.out.println(sd.sound());
	}
	public static void main(String[] args) {
		System.out.println("�Ҹ��� ����մϴ�");
		printSound(new Cat());
		printSound(new Dog());
	}
}

