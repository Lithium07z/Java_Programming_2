import java.util.*;
public class HashSetTest {
	public static void main(String args[]) { 
			Set<String> s = new HashSet<String>();
			String[] sample = { "�ܾ�", "�ߺ�", "����", "�ߺ�" };
			for (String a : sample)
				//�ߺ��Ǵ� �ܾ�� ������� ������ false ��ȯ
				if (!s.add(a))  
					System.out.println("�ߺ��� �ܾ�==> " + a);
					System.out.println("HashSet�� ����� �ܾ� ���� : " + s.size());
					System.out.println("�ߺ����� ���� �ܾ�: " + s);
	} 
}
