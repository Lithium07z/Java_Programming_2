// 프로그램 작성일자: 2019.08.29
// 프로그램 설명: 크기가 7인 정수형 배열을 10부터 99사이의 난수로 초기화 한 후, 제시된 결과처럼 출력되는 프로그램
// 프로그램 작성자: 20195138 김준호 
// 프로그램 최종 수정일자: 2019.08.29 PM 03:40
public class RandomNumberTest {
	public static void main(String[] args) {
		int[] rdArr = new int [7]; // 난수를 저장할 배열 
		
		for(int i = 0; i < rdArr.length; i++) { // 배열의 길이만큼 반복 
			rdArr[i] = (int)(Math.random() * 100); // 난수에 100을 곱하고 정수형으로 바꾼뒤 배열에 저장 
			for(int j = 0; j < i; j++) { // i크기보다 적은 횟수 만큼 반복 
				if(rdArr[i] == rdArr[j] || rdArr[i] < 10) { // 중복 숫자나 10 미만의 숫자가 나타나면
					i--; // 다시 반복 
				}
			}
		}
		int max = rdArr[0]; // 배열에서 가장 큰 값을 저장하는 함수 
		int mini = rdArr[0]; // 배열에서 가장 작은 값을 저장하는 함수 
		int maxIndex = 0; // 배열에서 가장 큰 값의 인덱스를 저장하는 함수 
		int miniIndex = 0; // 배열에서 가장 작은 값의 인덱스를 저장하는 함수 
		
		System.out.println("=== 배열 원소 출력 ========"); // 배열 원소를 출력 
		for(int rdArrOp : rdArr) { // int자료형을 가진 rdArrOp에 rdArr 원소값 저장
			System.out.print(rdArrOp + " "); // rdArrOp의 값을 출력 
		}
		
		for(int k = 0 ; k < rdArr.length ; k++){ // 배열 길이만큼 반복 
            if(rdArr[k] >= max){ // max값 보다 rdArr배열의 k번째 인덱스 값이 크거나 같을 경우 
                max = rdArr[k]; // max에  그 값을 저장함 
                maxIndex = k; // k를 가장 큰 값의 인덱스로 저장함 
            }
        }
		for(int l = 0 ; l < rdArr.length ; l++){ // 배열의 길이 만큼 반복 
            if(rdArr[l] <= mini){ // mini값 보다 rdArr배열의 l번째 인덱스 값이 작거나 같을 경우 
                mini = rdArr[l]; // mini에 그 값을 저장함 
                miniIndex = l; // l을 가장 작은 값의 인덱스로 저장함 
            }
        }
		
		System.out.println("\n가장 큰 값 : " + max + "\t" + "index : " + maxIndex); // 가장 큰 값과 그 인덱스 값 출력
		System.out.println("가장 작은 값 : " + mini + "\t" + "index : " + miniIndex); // 가장 작은 값과 그 인덱스 값 출력
	}
}
