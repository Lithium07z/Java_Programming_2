/*���α׷� �ۼ�����: 2019.12.03
 *���α׷� ����: �⺻ �ڷ����� int, short, long, float, double���� �����͸� �Է¹ް� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.12.03. PM 12:02
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
			// ���� ��Ʈ��->���� ��Ʈ��->������ ��Ʈ��
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
			// ���Ͽ� ����� ������� �о� �;� ��
			System.out.println("���� �ڷ����� ���Ϸ� ����մϴ�.");
			System.out.println("���Ͽ� ����� ���� �ڷ����� ����մϴ�.");
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