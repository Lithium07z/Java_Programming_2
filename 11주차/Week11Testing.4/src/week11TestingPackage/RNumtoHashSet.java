/*프로그램 작성일자: 2019.11.07
 *프로그램 설명: HashSet을 이용해두 자리 난수 10개를 출력하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.07 AM 11:50
 */
package week11TestingPackage;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
public class RNumtoHashSet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<Integer> rNum = new HashSet<>();
		Random random = new Random();
		
		System.out.println("두 자리 난수 10개를 출력합니다.");
		for(int i = 0; i < 10; i++) {
			int save = random.nextInt(100);
			if (save < 10) {
				i -= 1;
				continue;
			} else if (!rNum.add(save)) {
				i -= 1;
				continue;
			}	else {
				rNum.add(save);
			}
		}
		System.out.println(rNum);
	}
}
