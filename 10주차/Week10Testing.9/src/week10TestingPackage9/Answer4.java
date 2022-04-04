/*프로그램 작성일자: 2019.10.31
 *프로그램 설명: 여러 가지 유틸리티 라이브러리를 사용하여 제시된 결과처럼 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.03 PM 05:44
 */
package week10TestingPackage9;

public class Answer4 {
	public static void main(String[] args) {
		Manage manage = new Manage();
		manage.splitString(new String[] { "국가번호 : ", "도시식별번호 : ", "가입자 번호 : " }, "082-2-777-5566");
		manage.dateWrite();
		manage.startChar();
		System.out.println("34 + 56 - 12 * 2 = " + manage.calChar("34 + 56 - 12 * 2"));
		System.out.println("프로그램 종료");
	}
}