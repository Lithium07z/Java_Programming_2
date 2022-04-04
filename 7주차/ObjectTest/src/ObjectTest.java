/*프로그램 작성일자: 2019.10.10
 *프로그램 설명: 인터페이스를 이용해 세 객체 정보와 그 중 가장 키가 큰 사람을 출력하는 프로그램 
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.10.10 PM 09:01
 */
public class ObjectTest {
	public static void main(String[] args) {
		Person[] p = {new Person("경주", 178.0), new Person("길동", 185.0), new Person("홍길", 180.0)};
		for (Person temp : p) { // 세 객체 정보 모두 출력 
			System.out.println(temp.toString());
		}
		System.out.println("키가 가장 큰 사람 : " + getMaximum(p)); 
	}
	
	static Person getMaximum(Person[] array) {
		Person max = array[0]; // 일단 첫번째 값을 최대 값으로 기준을 세움
		for (int i = 0; i < array.length; i++) {
			if (max.compareTo(array[i]) == -1) { // max 객체의 compareTo에 다음 객체를 넣어 키 값을 비교한 뒤 반환 값이 -1 이면
				max = array[i]; // max에 해당 객체 저장 
			}
		}
		return max; // max 객체 반환 
	}
}

interface Comparable {
	int compareTo(Object per);
}