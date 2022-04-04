/*프로그램 작성일자: 2019.09.19
 *프로그램 설명: 임의로 받은 각자 다른 갯수의 인수값의 합을 모두 더해 출력하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.09.19 
 */
public class VarTypeTest {
	public static void main(String[] args) {
		System.out.println("1번째 합 : " + VarType.sum(34,12,56,78));
		System.out.println("2번째 합: " + VarType.sum(5, 67, 21, 99, 32, 45, 78, 12));
		System.out.println("3번째 합 : " + VarType.sum(3.4, 1.2, 8.7, 5.4, 3.7));
		System.out.println("4번째 합 : " + VarType.sum(12.3,5.6,8.9,14.2,3.1,77.1,9.5));
	}
}

class VarType {
	static int sum(int... ipNum) { // int형 매개변수를 가변적으로 받음 
		int total = 0;
		for (int temp : ipNum) {
			total += temp; // total에 가변인자로 받은 변수를 모두 더함 
		}
		return total;
	}
	static double sum(double... ipNum2) { // double형 매개변수를 가변적으로 받음 
		double total2 = 0;
		for (double temp2 : ipNum2) {
			total2 += temp2; // total2에 가변인자로 받은 변수를 모두 더함 
		}
		return total2;
	}
}