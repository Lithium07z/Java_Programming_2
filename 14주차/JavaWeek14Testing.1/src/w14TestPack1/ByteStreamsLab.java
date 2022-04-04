package w14TestPack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ByteStreamsLab {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: ");
		String inFileName = scan.next();
		System.out.print("���� ���� �̸��� �Է��Ͻÿ�: ");
		String outFileName = scan.next();
		try (InputStream inStream = new FileInputStream(inFileName);
				OutputStream outStream = new FileOutputStream(outFileName)) {
			int c;
			while ((c = inStream.read()) != -1) {
				outStream.write(c);
			}
		}
		System.out.println(inFileName + "�� " + outFileName + "�� �����Ͽ����ϴ�. ");
	}
}
