/*프로그램 작성일자: 2019.10.31
 *프로그램 설명: 키를 기준으로 정렬하여 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.31 PM 09:42
 */
package week10TestingPackage8;

import java.util.Arrays;
import java.util.Scanner;
public class PersonOutPut {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Person p1 = new Person("홍릉", 180.0);
		Person p2 = new Person("용원", 168.0);
		Person p3 = new Person("인성", 175.0);
		Person p4 = new Person("성우", 170.0);
		Person[] pArr = { p1, p2, p3, p4};
		double[] hArr = new double[pArr.length]; 
		
		System.out.println("==== 정렬 전 데이터 ====");
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].toString());
		}
		Arrays.sort(pArr); 
		
		System.out.println("==== 정렬 후 데이터 ====");
		for(int k = 0; k < pArr.length; k++) {
			System.out.println(pArr[k].toString());
		}
	}
}
