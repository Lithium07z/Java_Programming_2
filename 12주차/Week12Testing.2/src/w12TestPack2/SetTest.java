package w12TestPack2;

import java.util.*;

public class SetTest {
	public static void main(String args[]) {
		Student array[] = { new Student(2009002, "김철수"), new Student(2009001, "이철수"), new Student(2009003, "박철수") };
		List<Student> list = Arrays.asList(array); // 배열을 리스트로 변환
		Collections.sort(list); // 크기순으로 정렬
		System.out.println(list);
	}
}
