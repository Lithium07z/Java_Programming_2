public class Dim { // ó�� Ŭ���� 
	private int[] intArr; // privateŸ���� ������ �迭 intArr ���� 
	private double[] doubleArr; // privateŸ���� �Ǽ��� �迭 doubleArr ���� 
	
	void init(int size, char type) { // 
		if(type == 'I') { // ���� ���� Ÿ���� I�̸� 
			intArr = new int[size]; // �Է¹��� ũ�⸸ŭ�� �迭�� �ʱ�ȭ
			for(int i = 0; i < intArr.length; i++) { 
				intArr[i] = (int)(Math.random() * 10); // ������ ������ �迭�� ����
			}
			System.out.println(">> ������ �迭��  ������ �ʱ�ȭ�մϴ�."); 
			System.out.println(">> �ʱ�ȭ�� ������ �迭�� ����մϴ�.");
			for(int temp : intArr) {
				System.out.print(temp + " "); // �迭 ��� 
			}
		} else if(type == 'd') { // ���� ���� Ÿ���� d�̸�
			doubleArr = new double[size]; // �Է¹��� ũ�⸸ŭ�� �迭�� �ʱ�ȭ 
			for(int j = 0; j < doubleArr.length; j++) { 
				doubleArr[j] = Math.random(); // �Ǽ��� ������ �迭�� ����
			}
			System.out.println(">> �Ǽ��� �迭��  ������ �ʱ�ȭ�մϴ�.");
			System.out.println(">> �ʱ�ȭ�� �Ǽ��� �迭�� ����մϴ�.");
			for(double temp2 : doubleArr) {
				System.out.printf("%6.2f",temp2); // �Ҽ��� 2�ڸ����� ����� ��� 
			}
		}
	}
	
	int isearch(int digit) {
		if(digit > intArr.length) { // �Է¹��� digit���� �迭���� ���� ���
			return -1; // -1 ��ȯ
		}
		return intArr[digit];
	}
	
	double dsearch(int digit) {
		if(digit > doubleArr.length) { // �Է¹��� digit���� �迭���� ���� ���
			return -1.0; // -1.0 ��ȯ
		}
		return doubleArr[digit];
	}
}
