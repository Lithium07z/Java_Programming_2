package w12TestPack2;

import java.util.*;

public class SetTest {
	public static void main(String args[]) {
		Student array[] = { new Student(2009002, "��ö��"), new Student(2009001, "��ö��"), new Student(2009003, "��ö��") };
		List<Student> list = Arrays.asList(array); // �迭�� ����Ʈ�� ��ȯ
		Collections.sort(list); // ũ������� ����
		System.out.println(list);
	}
}
