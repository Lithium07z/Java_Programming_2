/*���α׷� �ۼ�����: 2019.11.07
 *���α׷� ����: Set�� �̿��� �����հ� �������� ���ϴ� ���α׷� 
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.11.07 PM 08:15
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
		
		System.out.println(">> �迭 ���� ��� ");
		for(int i = 0; i < 6; i++) {
			System.out.print(d1[i] + " ");
		}
		
		System.out.println();
		System.out.println(">> �迭 ���� ��� ");
		
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
		System.out.println("������ : " + Arr);
		System.out.println("������ : " + Arr2);
	}
}
