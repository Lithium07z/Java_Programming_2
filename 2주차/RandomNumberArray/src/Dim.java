public class Dim { // 처리 클래스 
	private int[] intArr; // private타입의 정수형 배열 intArr 선언 
	private double[] doubleArr; // private타입의 실수형 배열 doubleArr 선언 
	
	void init(int size, char type) { // 
		if(type == 'I') { // 만약 받은 타입이 I이면 
			intArr = new int[size]; // 입력받은 크기만큼의 배열로 초기화
			for(int i = 0; i < intArr.length; i++) { 
				intArr[i] = (int)(Math.random() * 10); // 정수형 난수를 배열에 넣음
			}
			System.out.println(">> 정수형 배열을  난수로 초기화합니다."); 
			System.out.println(">> 초기화된 정수형 배열을 출력합니다.");
			for(int temp : intArr) {
				System.out.print(temp + " "); // 배열 출력 
			}
		} else if(type == 'd') { // 만약 받은 타입이 d이면
			doubleArr = new double[size]; // 입력받은 크기만큼의 배열로 초기화 
			for(int j = 0; j < doubleArr.length; j++) { 
				doubleArr[j] = Math.random(); // 실수형 난수를 배열에 넣음
			}
			System.out.println(">> 실수형 배열을  난수로 초기화합니다.");
			System.out.println(">> 초기화된 실수형 배열을 출력합니다.");
			for(double temp2 : doubleArr) {
				System.out.printf("%6.2f",temp2); // 소수점 2자릿수만 남기고 출력 
			}
		}
	}
	
	int isearch(int digit) {
		if(digit > intArr.length) { // 입력받은 digit값이 배열길이 보다 길면
			return -1; // -1 반환
		}
		return intArr[digit];
	}
	
	double dsearch(int digit) {
		if(digit > doubleArr.length) { // 입력받은 digit값이 배열길이 보다 길면
			return -1.0; // -1.0 반환
		}
		return doubleArr[digit];
	}
}
