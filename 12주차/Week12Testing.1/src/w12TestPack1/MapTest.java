package w12TestPack1;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "구준표"));
		st.put("20090002", new Student(20090002, "금잔디"));
		st.put("20090003", new Student(20090003, "윤지후"));
		System.out.println(st); // 모든 항목을 출력한다.
		st.remove("20090002"); // 하나의 항목을 삭제한다.
		st.put("20090003", new Student(20090003, "소이정")); // 하나의 항목을 대치한다.
		System.out.println(">>>>>>> 키값에 대응하는 value 출력");
		System.out.println(st.get("20090003")); // 키 값에 해당하는 value 반환
		System.out.println("\n >>>>>>  1: 람다식을 이용한 원소 출력 ");
		st.forEach((key, value) -> {
			System.out.println("key = " + key + ", value = " + value);
		});

		System.out.println("\n >>>>>>  2: Map.Entry 인터페이스를 이용한 원소 출력 ");
		for (Map.Entry<String, Student> s : st.entrySet()) { // 모든 항목을 방문한다
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}

	}
}
