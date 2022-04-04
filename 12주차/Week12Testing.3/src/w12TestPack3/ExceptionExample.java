package w12TestPack3;

public class ExceptionExample {
	public static void error(String str) {
		System.out.println(str + "���ܸ� ���� ó�� �Ͽ����ϴ� ");
	}
	public static void main(String args[]) {
		Account obj = new Account();
		try {
			int amount = obj.withdraw(100000000); // ���� �߻� �޼ҵ�
			System.out.println("�����:" + amount);
		} catch (Exception e) { // �߻��� ���� ó��
			String msg = e.getMessage(); // ���� �޽��� ���
			System.out.println(msg);
			error("���� ");
		}
		System.out.println(obj);
		try {
			int amount = obj.deposit(-100); // ���� �߻� �޼ҵ�
			System.out.println("�Աݾ�:" + amount);
		} catch (Exception e) { // �߻��� ���� ó��
			String msg = e.getMessage(); // ���� �޽��� ���
			System.out.println(msg);
			error("�Ա�");
		}
		System.out.println(obj);
	}
}
