package w15TestPack2;

import java.io.*; //Serializable 인터페이스를 구현하기 위해 필요
import java.util.*;

public class ObjectFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		ArrayList<PetRecord> list = new ArrayList<>();
		try {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			PetRecord one = new PetRecord("해바라기", 7, 10.2);
			PetRecord two = new PetRecord("금강초롱", 4, 4.2);
			list.add(one);
			list.add(two);
			out.writeObject(list); // ArrayList 객체를 파일에 저장
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			list = (ArrayList<PetRecord>) in.readObject(); // 파일에서 객체를 읽어 옴
			for (PetRecord obj : list)
				obj.disPlay();
		} finally {
			if (out != null)
				out.close();
			if (in != null)
				in.close();
		}
		System.out.println("프로그램 종료");
	}
}
