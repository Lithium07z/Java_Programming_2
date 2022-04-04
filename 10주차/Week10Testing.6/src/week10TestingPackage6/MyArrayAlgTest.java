/*프로그램 작성일자: 2019.10.31
 *프로그램 설명: 예시문제 5번을 제너릭 클래스로 변형 후 실행
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.31 AM 11:54
 */
package week10TestingPackage6;

public class MyArrayAlgTest {
	public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		Integer[] integer= {4,2,7,30,55,21};
		MyArrayAlg<String> str = new MyArrayAlg<>();
		MyArrayAlg<Integer> digit = new MyArrayAlg<>();
		str.swap(language, 0,2);
		str.write(language);
		digit.swap(integer, 2, 4);
		digit.write(integer);
	}
}
