/*���α׷� �ۼ�����: 2019.10.31
 *���α׷� ����: �Է¹��� ���ڿ��� �ܾ�� �и��� �� �и� �� ���� �� ������ ���¸� ����ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.31 PM 08:42
 */
package mypackage;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		StringTokenizer stk = new StringTokenizer(input.nextLine());
		
		System.out.println("��ū ���� : " + stk.countTokens());
		String[] sArr = new String [stk.countTokens()];
		
		System.out.print("���� �� ��� : ");
		while (stk.hasMoreTokens()) {        
            sArr[i] = stk.nextToken();   
            System.out.print(sArr[i] + " ");   
            i += 1;
        }
		
		Arrays.sort(sArr);
		System.out.print("\n���� �� ��� : ");
		for (int j = 0; j < sArr.length; j++) {
			System.out.print(sArr[j] + " ");
		}
	}
}