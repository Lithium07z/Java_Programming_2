// ���α׷� �ۼ�����: 2019.08.29
// ���α׷� ����: ũ�Ⱑ 7�� ������ �迭�� 10���� 99������ ������ �ʱ�ȭ �� ��, ���õ� ���ó�� ��µǴ� ���α׷�
// ���α׷� �ۼ���: 20195138 ����ȣ 
// ���α׷� ���� ��������: 2019.08.29 PM 03:40
public class RandomNumberTest {
	public static void main(String[] args) {
		int[] rdArr = new int [7]; // ������ ������ �迭 
		
		for(int i = 0; i < rdArr.length; i++) { // �迭�� ���̸�ŭ �ݺ� 
			rdArr[i] = (int)(Math.random() * 100); // ������ 100�� ���ϰ� ���������� �ٲ۵� �迭�� ���� 
			for(int j = 0; j < i; j++) { // iũ�⺸�� ���� Ƚ�� ��ŭ �ݺ� 
				if(rdArr[i] == rdArr[j] || rdArr[i] < 10) { // �ߺ� ���ڳ� 10 �̸��� ���ڰ� ��Ÿ����
					i--; // �ٽ� �ݺ� 
				}
			}
		}
		int max = rdArr[0]; // �迭���� ���� ū ���� �����ϴ� �Լ� 
		int mini = rdArr[0]; // �迭���� ���� ���� ���� �����ϴ� �Լ� 
		int maxIndex = 0; // �迭���� ���� ū ���� �ε����� �����ϴ� �Լ� 
		int miniIndex = 0; // �迭���� ���� ���� ���� �ε����� �����ϴ� �Լ� 
		
		System.out.println("=== �迭 ���� ��� ========"); // �迭 ���Ҹ� ��� 
		for(int rdArrOp : rdArr) { // int�ڷ����� ���� rdArrOp�� rdArr ���Ұ� ����
			System.out.print(rdArrOp + " "); // rdArrOp�� ���� ��� 
		}
		
		for(int k = 0 ; k < rdArr.length ; k++){ // �迭 ���̸�ŭ �ݺ� 
            if(rdArr[k] >= max){ // max�� ���� rdArr�迭�� k��° �ε��� ���� ũ�ų� ���� ��� 
                max = rdArr[k]; // max��  �� ���� ������ 
                maxIndex = k; // k�� ���� ū ���� �ε����� ������ 
            }
        }
		for(int l = 0 ; l < rdArr.length ; l++){ // �迭�� ���� ��ŭ �ݺ� 
            if(rdArr[l] <= mini){ // mini�� ���� rdArr�迭�� l��° �ε��� ���� �۰ų� ���� ��� 
                mini = rdArr[l]; // mini�� �� ���� ������ 
                miniIndex = l; // l�� ���� ���� ���� �ε����� ������ 
            }
        }
		
		System.out.println("\n���� ū �� : " + max + "\t" + "index : " + maxIndex); // ���� ū ���� �� �ε��� �� ���
		System.out.println("���� ���� �� : " + mini + "\t" + "index : " + miniIndex); // ���� ���� ���� �� �ε��� �� ���
	}
}
