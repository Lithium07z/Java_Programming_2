package w14TestPack2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTextStream {
	public static void main(String[] args) throws IOException {
		Scanner key = new Scanner(System.in);
		FileWriter output = null;
		FileReader input = null;
		char var;
		int data;
		try {
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
			System.out.println("======���Ͽ� ����� ������ ���");
			while ((data = input.read()) != -1) // �� ���ھ� �б�, read()�� �о� �� �����͸� int�� ��ȯ
				System.out.println((char) data); // ���ڷ� ��ȯ�Ͽ� ���
		} finally {
			if (output != null)
				output.close();
			if (input != null)
				input.close();
		}
	}
}
