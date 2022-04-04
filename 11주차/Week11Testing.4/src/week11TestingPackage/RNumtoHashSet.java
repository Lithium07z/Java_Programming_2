/*���α׷� �ۼ�����: 2019.11.07
 *���α׷� ����: HashSet�� �̿��ص� �ڸ� ���� 10���� ����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.07 AM 11:50
 */
package week11TestingPackage;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
public class RNumtoHashSet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<Integer> rNum = new HashSet<>();
		Random random = new Random();
		
		System.out.println("�� �ڸ� ���� 10���� ����մϴ�.");
		for(int i = 0; i < 10; i++) {
			int save = random.nextInt(100);
			if (save < 10) {
				i -= 1;
				continue;
			} else if (!rNum.add(save)) {
				i -= 1;
				continue;
			}	else {
				rNum.add(save);
			}
		}
		System.out.println(rNum);
	}
}
