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
			out.println("변화를 원한다면,");
			out.println("제일 먼저 자신이 변화할 수 있다는 것과");
			out.println("변화하기까지 포기하지 않고");
			out.println("계속해서 노력할 수 있다는 것을 믿어야 한다.");
			out.flush(); // 버퍼를 비움
			in = new BufferedReader(new FileReader("result.txt")); // 버퍼 스트림과 연결
			String line;
			while ((line = in.readLine()) != null) { // 라인단위로 읽어옴
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
