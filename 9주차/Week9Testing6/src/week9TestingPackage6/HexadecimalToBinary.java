/*���α׷� �ۼ�����: 2019.10.28
 *���α׷� ����: 16������ �������� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� �ۼ�����: 2019.10.28
 */
package week9TestingPackage6;

import java.util.Scanner;
public class HexadecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] hexa2bin = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
							 "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		String exit;
		char[] bCharArr;
		
		while(true) {
			System.out.println("�ݺ����� �����Ϸ��� s �Ǵ� S�� �Է��ϼ��� : ");
			exit = input.next();
			bCharArr = exit.toCharArray();
			for(int i = 0; i < bCharArr.length; i++) {
				if (bCharArr[i] == 's' || bCharArr[i] == 'S') {
					System.out.println("���α׷� ����");
					System.exit(0);
				} else if ((int)bCharArr[i] - 48 >= 0 && (int)bCharArr[i] - 48 <= 9) {
					System.out.print(hexa2bin[(int)bCharArr[i] - 48] + " ");
				} else if ((int)bCharArr[i] < 97 || (int)bCharArr[i] > 102 || 
						  ((int)bCharArr[i] - 48 >= 0 && (int)bCharArr[i] - 48 <= 9)) {
					System.out.print("---- ");
				} else {
					for(int j = 10; j < 16; j++) {
						if ((int)bCharArr[i] - j == 87) {
							System.out.print(hexa2bin[j] + " ");
						}
					}
				}
			}
			System.out.println("\n");
		}
	}
}
