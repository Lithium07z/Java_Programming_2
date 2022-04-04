/*프로그램 작성일자: 2019.11.14
 *프로그램 설명: HashMap을 사용하여 주사위를 100번 던졌을 때 주사위 눈의 빈도수를 계산하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.14 PM 07:25
 */
package w12TestPack4;

import java.util.Map;
public class Answer1 {
public static void main(String args[]) {
Map<Integer, Integer> map;
       map=Count.count();  //빈도수를 계산한 HashMap을 반환받아 저장
       System.out.println("Map에 저장된 빈도수를 출력합니다");
       Count.write(map);  //HashMap에 저장된 원소 출력
	}
}
