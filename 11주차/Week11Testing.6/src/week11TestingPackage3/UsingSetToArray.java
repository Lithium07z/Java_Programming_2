/*프로그램 작성일자: 2019.11.07
 *프로그램 설명: Set을 이용해 교집합과 합집합을 구하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.07 PM 08:15
 */
package week11TestingPackage3;

import java.util.Set;
import java.util.TreeSet;
public class UsingSetToArray {
	public static void main(String[] args) {
		int[] d1= {4,2,3,7,6,12};
		int[] d2= {4,6,12,3,5,9};
		Set<Integer> Arr = new TreeSet<>();
		Set<Integer> Arr2 = new TreeSet<>();
		
		System.out.println(">> 배열 원소 출력 ");
		for(int i = 0; i < 6; i++) {
			System.out.print(d1[i] + " ");
		}
		
		System.out.println();
		System.out.println(">> 배열 원소 출력 ");
		
		for(int k = 0; k < 6; k++) {
			System.out.print(d2[k] + " ");
		}
		
		for(int j = 0 ; j < 6; j++) {
			Arr.add(d1[j]);
		}
		for(int l = 0; l < 6; l++) {
			if(!Arr.add(d2[l])) {
				Arr2.add(d2[l]);
			}
			Arr.add(d2[l]);
		}
		System.out.println();
		System.out.println("합집합 : " + Arr);
		System.out.println("교집합 : " + Arr2);
	}
}
