package w15TestPack1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			int c;
			// 파일 스트림->버퍼 스트림->데이터 스트림
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
			out.writeDouble(3.14);
			out.writeInt(100);
			out.writeUTF("자신의 생각을 바꿀 수 없다.");
			out.flush();
			in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
			// 파일에 저장된 순서대로 읽어 와야 함
			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
