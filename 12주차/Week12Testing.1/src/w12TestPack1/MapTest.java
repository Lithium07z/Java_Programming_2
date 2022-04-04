package w12TestPack1;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "����ǥ"));
		st.put("20090002", new Student(20090002, "���ܵ�"));
		st.put("20090003", new Student(20090003, "������"));
		System.out.println(st); // ��� �׸��� ����Ѵ�.
		st.remove("20090002"); // �ϳ��� �׸��� �����Ѵ�.
		st.put("20090003", new Student(20090003, "������")); // �ϳ��� �׸��� ��ġ�Ѵ�.
		System.out.println(">>>>>>> Ű���� �����ϴ� value ���");
		System.out.println(st.get("20090003")); // Ű ���� �ش��ϴ� value ��ȯ
		System.out.println("\n >>>>>>  1: ���ٽ��� �̿��� ���� ��� ");
		st.forEach((key, value) -> {
			System.out.println("key = " + key + ", value = " + value);
		});

		System.out.println("\n >>>>>>  2: Map.Entry �������̽��� �̿��� ���� ��� ");
		for (Map.Entry<String, Student> s : st.entrySet()) { // ��� �׸��� �湮�Ѵ�
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}

	}
}
