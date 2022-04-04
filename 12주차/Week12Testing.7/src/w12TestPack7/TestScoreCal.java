/*프로그램 작성일자: 2019.11.14
 *프로그램 설명: 한 학급 학생들의 학생 번호와 국어, 영어, 수학 시험 점수를 입력 받아 학생 번호순으로 정렬하고 학생 개인의 총점과 평균 및 
 *			   과목별 총점과 평균을 구하여 입력 자료와 함께 출력하는 성적처리 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.11.16 PM 08:32
 */
package w12TestPack7;

public class TestScoreCal {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.saveScore();
		cal.sortList();		
	}
}
