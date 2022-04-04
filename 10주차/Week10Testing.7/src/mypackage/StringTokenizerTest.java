/*프로그램 작성일자: 2019.10.31
 *프로그램 설명: 입력받은 문자열을 단어로 분리한 뒤 분리 된 상태 및 정렬한 상태를 출력하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.31 PM 08:42
 */
package mypackage;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		System.out.print("문자열을 입력하세요 : ");
		StringTokenizer stk = new StringTokenizer(input.nextLine());
		
		System.out.println("토큰 갯수 : " + stk.countTokens());
		String[] sArr = new String [stk.countTokens()];
		
		System.out.print("정렬 전 결과 : ");
		while (stk.hasMoreTokens()) {        
            sArr[i] = stk.nextToken();   
            System.out.print(sArr[i] + " ");   
            i += 1;
        }
		
		Arrays.sort(sArr);
		System.out.print("\n정렬 후 결과 : ");
		for (int j = 0; j < sArr.length; j++) {
			System.out.print(sArr[j] + " ");
		}
	}
}