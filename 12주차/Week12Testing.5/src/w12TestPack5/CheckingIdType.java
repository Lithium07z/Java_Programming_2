package w12TestPack5;

import java.util.Scanner;

public class CheckingIdType {
	static void inputId() {
		Scanner input = new Scanner(System.in);
		String id = null;
		char[] idCut;
		int idInt;
			while(true) {
				System.out.print(">> id�� �Է��ϼ��� _ ");
				id = input.next();
				idCut = id.toCharArray();
				idInt = idCut[0];
				try {
					if (idCut.length <= 8) {
						throw new Exception(id + "�� ����� �� ���� ���̵� �Դϴ�.\nù ���ڴ� ������ �̰ų� ���̴� 8 �̻� �̾�� �մϴ�.");
					} else if (idInt < 65 || (idInt > 90 && idInt <97) || idInt > 122) {
						throw new Exception(id + "�� ����� �� ���� ���̵� �Դϴ�.\nù ���ڴ� ������ �̰ų� ���̴� 8 �̻� �̾�� �մϴ�.");
					} else {
						System.out.println(id + "�� ��� ������ ���̵� �Դϴ�.");
						System.out.println("program finish");
						System.exit(0);
					}
				} catch(Exception e) {
					String msg = e.getMessage();
					System.out.println(msg);
					continue;
			}
		}
	}
}
