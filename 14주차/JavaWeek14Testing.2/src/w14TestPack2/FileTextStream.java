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
				System.out.print("문자 입력(종료:q)");
				var = key.next().charAt(0); // 한글처리 가능
				if (var == 'q') // 'q'가 입력되면 입력 중단
					break;
				output.write(var); // 한 문자씩 쓰기
			}
			output.close(); // "output.txt"을 읽어 오는 작업을 위해 닫아줌

			input = new FileReader("output.txt"); // 읽기 작업을 위해 다시 open
			System.out.println("======파일에 저장된 데이터 출력");
			while ((data = input.read()) != -1) // 한 문자씩 읽기, read()는 읽어 온 데이터를 int로 반환
				System.out.println((char) data); // 문자로 변환하여 출력
		} finally {
			if (output != null)
				output.close();
			if (input != null)
				input.close();
		}
	}
}
