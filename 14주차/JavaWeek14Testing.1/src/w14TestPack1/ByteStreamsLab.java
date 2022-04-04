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
		System.out.print("원본 파일 이름을 입력하시오: ");
		String inFileName = scan.next();
		System.out.print("복사 파일 이름을 입력하시오: ");
		String outFileName = scan.next();
		try (InputStream inStream = new FileInputStream(inFileName);
				OutputStream outStream = new FileOutputStream(outFileName)) {
			int c;
			while ((c = inStream.read()) != -1) {
				outStream.write(c);
			}
		}
		System.out.println(inFileName + "을 " + outFileName + "로 복사하였습니다. ");
	}
}
