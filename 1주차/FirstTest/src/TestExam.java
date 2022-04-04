// 프로그램 작성일자: 2019.08.29
// 프로그램 설명: 수식 1+(1+2)+(1+2+3)+...+(1+2+3+...+100)을 계산하는 프로그램
// 프로그램 작성자: 20195138 김준호 
// 프로그램 최종 수정일자: 2019.08.29 PM 02:20
public class TestExam {
	public static void main(String[] args) {
		int sum = 0; // 수식의 값을 누적시킬 함수 
		for(int i = 1; i <= 100; i++) { // i를 1씩 100번 증가시킴
			for(int j = 1; j <= i; j++) { // i와 크기와 같거나 그 이하의 모든 값 만큼 반복  
				sum += 1; // 반복한 만큼 1씩 sum에 누적
			}
		}
		System.out.println(sum); // sum 출력 
	}
}
