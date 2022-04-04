/*프로그램 작성일자: 2019.11.28
 *프로그램 설명: 문자 스트림 입출력 예제에서 생성된 “output.txt”파일의 내용을 “copy.txt”에 
 *			   복사한 후 두 파일의 내용을 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.28
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
			System.out.print("문자 입력(종료:q)");
			var = key.next().charAt(0); // 한글처리 가능
			if (var == 'q') // 'q'가 입력되면 입력 중단
				break;
			output.write(var); // 한 문자씩 쓰기
		}
		output.close(); // "output.txt"을 읽어 오는 작업을 위해 닫아줌

		input = new FileReader("output.txt"); // 읽기 작업을 위해 다시 open
		try (InputStream inStream = new FileInputStream("output.txt");
				OutputStream outStream = new FileOutputStream("copy.txt")) {
			int c;
			while ((c = inStream.read()) != -1) {
				outStream.write(c);
			}
		}
		cinput = new FileReader("copy.txt");
		System.out.println("파일 복사 완료");
		System.out.println("====== output.txt 파일 내용 ======");
		while ((data = input.read()) != -1) {
			System.out.print((char) data + " ");
		}
		System.out.println("\n====== copy.txt 파일 내용 ======");
		while ((data = cinput.read()) != -1) {
			System.out.print((char) data + " ");
		}
		System.out.println("\n프로그램 종료");
		input.close();
		cinput.close();
	}
}
