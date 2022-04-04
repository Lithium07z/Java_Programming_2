/*프로그램 작성일자: 2019.11.07
 *프로그램 설명: 내용 점검 1번 문제에서 ArrayList에 객체를 저장할 저장 할 때 오름차순으로 저장될 수 있도록 수정한 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.10. PM 09:05
 */
package week11TestingPackage7;

import java.util.ArrayList;
public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<Person> alist = new ArrayList<>();
		
		ListExam.add(alist, new Person("성우", 179));
		ListExam.add(alist, new Person("태동", 173));
		ListExam.add(alist, new Person("인국", 183));
		ListExam.add(alist, new Person("용권", 180));
		ListExam.write(alist);
    }
}
