/*���α׷� �ۼ�����: 2019.10.29
 *���α׷� ����: ���� �ձ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� �ۼ�����: 2019.10.29
 */
package week9TestingPackage7;

import java.util.Scanner;
import java.util.Random;
public class WordChain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String[] wPack = {"�ݼ���", "����", "�峭��", "������", "����", "����", "����", "��å", "������", "����"};
		String iWord;
		String sWord;
		char again;
		int rNum;
		
		rNum = random.nextInt(10);
		sWord = wPack[rNum].substring(wPack[rNum].length() - 1);
		
		sWhile:
		while(true) {
			System.out.println("���� �ձ� ������ �����մϴ�~~~");
			System.out.print(wPack[rNum] + "�� " + sWord + "�� �����ϴ� �ܾ� >> ");
			iWord = input.next();
			
			while(true) {
			if (iWord.equals("c")) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			} else if (iWord.substring(0, 1).equals(sWord) == false) {
				System.out.print("Ʋ�Ƚ��ϴ�. \n����ϰڽ��ϱ�? >> ");
				again = input.next().charAt(0);
				if (again == 'c') {
					rNum = random.nextInt(10);
					sWord = wPack[rNum].substring(wPack[rNum].length() - 1);
					continue sWhile;
				} else {
					System.out.println("������ �����մϴ�.");
					System.exit(0);
				}
			} else if (iWord.substring(0, 1).equals(sWord) == true ||
					   iWord.substring(0, 1).equals(sWord.substring(sWord.length() - 1)) == true) {
				System.out.print(iWord + "�� " + iWord.substring(iWord.length() - 1) + "�� �����ϴ� �ܾ� >> ");
				sWord = iWord.substring(iWord.length() - 1);
				iWord = input.next();
				continue;
				}
			}
		}
	}
} 
