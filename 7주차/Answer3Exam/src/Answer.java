interface Action{
	void work();
}
public class Answer {
	public static void main(String[] args) {
		Action action = new Action() {
			public void work() { // �������̽� �� �߻�޼ҵ� ���� 
				System.out.println("����Ŭ������ �������̽��� ����");
				System.out.println("���� ��ü�� work() �޼ҵ带 ȣ���մϴ�.");
			}
		}; // ���� Ŭ���� ����
		action.work();
	}
}