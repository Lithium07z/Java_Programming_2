/*���α׷� �ۼ�����: 2019.10.28
 *���α׷� ����: ǥ�� �Է���ġ�� �Է� ���� ���ڿ��� �������� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.10.28
 */
package week9TestingPackage5;

import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ipString;
		
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			ipString = input.nextLine();
			if (ipString.equals("finish")) {
				System.out.println("���α׷� ����");
				break;
			} else { 
				System.out.println(reverseString(ipString));
				continue;
			}
		}
	}
	
	public static String reverseString(String s){
        return (new StringBuffer(s)).reverse().toString();
    }
}
