/*프로그램 작성일자: 2019.12.01
 *프로그램 설명: 내용점검 3번 문제 “result.txt” 텍스트 파일을 라인 단위로 읽어서 앞에 라인 번호를 붙여서 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.12.01 PM 02:59
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
			out.println("변화를 원한다면,");
			out.println("제일 먼저 자신이 변화할 수 있다는 것과");
			out.println("변화하기까지 포기하지 않고");
			out.println("계속해서 노력할 수 있다는 것을 믿어야 한다.");
			out.flush(); // 버퍼를 비움
			in = new BufferedReader(new FileReader("result.txt")); // 버퍼 스트림과 연결
			String line;
			while ((line = in.readLine()) != null) { // 라인단위로 읽어옴
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