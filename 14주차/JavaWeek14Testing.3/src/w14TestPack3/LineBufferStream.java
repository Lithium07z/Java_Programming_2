package w14TestPack3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LineBufferStream {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		PrintWriter out = null;
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
				System.out.println(line);
			}
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}
}
