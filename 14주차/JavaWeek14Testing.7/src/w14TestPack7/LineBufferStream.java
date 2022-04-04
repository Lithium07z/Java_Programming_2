/*���α׷� �ۼ�����: 2019.12.01
 *���α׷� ����: �������� 3�� ���� ��result.txt�� �ؽ�Ʈ ������ ���� ������ �о �տ� ���� ��ȣ�� �ٿ��� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.12.01 PM 02:59
 */
package w14TestPack7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineBufferStream {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		PrintWriter out = null;
		int loop = 1;
		try {
			out = new PrintWriter(new FileWriter("result.txt"));
			out.println("��ȭ�� ���Ѵٸ�,");
			out.println("���� ���� �ڽ��� ��ȭ�� �� �ִٴ� �Ͱ�");
			out.println("��ȭ�ϱ���� �������� �ʰ�");
			out.println("����ؼ� ����� �� �ִٴ� ���� �Ͼ�� �Ѵ�.");
			out.flush(); // ���۸� ���
			in = new BufferedReader(new FileReader("result.txt")); // ���� ��Ʈ���� ����
			String line;
			while ((line = in.readLine()) != null) { // ���δ����� �о��
				System.out.println(loop + ") " +line);
				loop += 1;
			}
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}
}