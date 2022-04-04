/*프로그램 작성일자: 2019.11.07
 *프로그램 설명: ArrayList 기능을 이용해 문제를 해결하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 작성일자: 2019.11.07 PM 12:10
 */
package week11TestingPackage2;

import java.util.Arrays;
import java.util.ArrayList;
public class ArrayListTest {
	public static void main(String[] args) {
		String[] s = { "사과", "배", "바나나" };
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
		
		list.add("포도");
		list.add(2, "자몽");
		System.out.println("----리스트 출력----");
		for (String temp : list) {
			System.out.println(temp + " ");
		}
		System.out.println("----------------");
		System.out.println("인덱스 3 : " + list.get(3));
		list.set(2, "메론");
		list.add("배");
		System.out.println("배가 저장된 위치 :" + list.indexOf("배") );
		list.remove(3);
		System.out.println("----리스트 출력----");
		for (String temp : list) {
			System.out.println(temp + " ");
		}
		System.out.println("----------------");
	}
}
 