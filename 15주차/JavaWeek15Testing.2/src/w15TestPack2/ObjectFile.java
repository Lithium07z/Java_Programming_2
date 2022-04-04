package w15TestPack2;

import java.io.*; //Serializable �������̽��� �����ϱ� ���� �ʿ�
import java.util.*;

public class ObjectFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		ArrayList<PetRecord> list = new ArrayList<>();
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			PetRecord one = new PetRecord("�عٶ��", 7, 10.2);
			PetRecord two = new PetRecord("�ݰ��ʷ�", 4, 4.2);
			list.add(one);
			list.add(two);
			out.writeObject(list); // ArrayList ��ü�� ���Ͽ� ����
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			list = (ArrayList<PetRecord>) in.readObject(); // ���Ͽ��� ��ü�� �о� ��
			for (PetRecord obj : list)
				obj.disPlay();
		} finally {
			if (out != null)
				out.close();
			if (in != null)
				in.close();
		}
		System.out.println("���α׷� ����");
	}
}
