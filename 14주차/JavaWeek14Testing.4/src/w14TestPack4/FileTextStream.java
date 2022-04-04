/*���α׷� �ۼ�����: 2019.11.28
 *���α׷� ����: ���� ��Ʈ�� ����� �������� ������ ��output.txt�������� ������ ��copy.txt���� 
 *			   ������ �� �� ������ ������ ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.28
 */
package w14TestPack4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileTextStream {
	public static void main(String[] args) throws IOException {
		Scanner key = new Scanner(System.in);
		FileWriter output = null;
		FileReader input = null;
		FileReader cinput = null;
		char var;
		int data;
		output = new FileWriter("output.txt");
		
		while (true) {
			System.out.print("���� �Է�(����:q)");
			var = key.next().charAt(0); // �ѱ�ó�� ����
			if (var == 'q') // 'q'�� �ԷµǸ� �Է� �ߴ�
				break;
			output.write(var); // �� ���ھ� ����
		}
		output.close(); // "output.txt"�� �о� ���� �۾��� ���� �ݾ���

		input = new FileReader("output.txt"); // �б� �۾��� ���� �ٽ� open
		try (InputStream inStream = new FileInputStream("output.txt");
				OutputStream outStream = new FileOutputStream("copy.txt")) {
			int c;
			while ((c = inStream.read()) != -1) {
				outStream.write(c);
			}
		}
		cinput = new FileReader("copy.txt");
		System.out.println("���� ���� �Ϸ�");
		System.out.println("====== output.txt ���� ���� ======");
		while ((data = input.read()) != -1) {
			System.out.print((char) data + " ");
		}
		System.out.println("\n====== copy.txt ���� ���� ======");
		while ((data = cinput.read()) != -1) {
			System.out.print((char) data + " ");
		}
		System.out.println("\n���α׷� ����");
		input.close();
		cinput.close();
	}
}
