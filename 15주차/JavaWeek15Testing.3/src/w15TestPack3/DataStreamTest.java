/*프로그램 작성일자: 2019.12.03
 *프로그램 설명: 기본 자료형인 int, short, long, float, double형의 데이터를 입력받고 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.12.03. PM 12:02
 */
package w15TestPack3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataStreamTest {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		DataInputStream in = null;
		DataOutputStream out = null;
		int itype;
		short stype;
		long ltype;
		float ftype;
		double dtype;
		
		try {
			int c;
			// 파일 스트림->버퍼 스트림->데이터 스트림
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.bin")));
			System.out.print("int : ");
			itype = input.nextInt();
			out.writeInt(itype);
			System.out.print("short : ");
			stype = input.nextShort();
			out.writeShort(stype);
			System.out.print("long : ");
			ltype = input.nextLong();
			out.writeLong(ltype);
			System.out.print("float : ");
			ftype = input.nextFloat();
			out.writeFloat(ftype);
			System.out.print("double : ");
			dtype = input.nextDouble();
			out.writeDouble(dtype);
			out.flush();
			in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.bin")));
			// 파일에 저장된 순서대로 읽어 와야 함
			System.out.println("기초 자료형을 파일로 출력합니다.");
			System.out.println("파일에 저장된 기초 자료형을 출력합니다.");
			System.out.println(in.readInt());
			System.out.println(in.readShort());
			System.out.println(in.readLong());
			System.out.println(in.readFloat());
			System.out.println(in.readDouble());
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