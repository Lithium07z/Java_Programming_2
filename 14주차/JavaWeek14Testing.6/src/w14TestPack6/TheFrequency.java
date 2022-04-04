/*프로그램 작성일자: 2019.11.28
 *프로그램 설명: 입력된 문자열을 output.txt 파일에 저장한 후 문자의 빈도수를 계산하여 출력하는 프로그램
 *프로그램 작성자: 20195138 김준호
 *프로그램 최종 수정일자: 2019.12.01 PM 02:50
 *추가 설명: 지금 껏 이렇게 오래 걸린 과제는 없었다. 근데 끝내고 나니까 너무 좋다. 재밌었다. 방학때 이런 과제들 하면 좋을 것 같다.
 */
package w14TestPack6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheFrequency {
	public static void main(String[] args) throws IOException {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Integer, Character> map2 = new HashMap<Integer, Character>();
		Scanner input = new Scanner(System.in);
		FileWriter output = null;
		String word;
		int loop = 0;
		Integer freq = 0;

		output = new FileWriter("output.txt");

		while (true) {
			System.out.print("문자열 입력(종료:f 또는 F) : ");
			word = input.next();
			if (word.charAt(0) == 'f' || word.charAt(0) == 'F') { // f 입력시 종료
				break;
			}
			for (int i = 0; i < word.length(); i++) { // 단어 길이 만큼 반복해서
				if (map.containsKey(word.charAt(i)) == true) { // 만약 map에 있는 문자와 단어 내 글자가 일치하면 아무것도 하지 않고 넘김
				} else {
					map.put(word.charAt(i), 0); // 만약 map내 없는 단어라면 단어 추가 
					map2.put(loop, word.charAt(i)); // map2에 map의 key 값을 저장
					loop += 1; // loop값 갱신으로 map2의 키 값도 갱신함
				}
			}
			for (int j = 0; j < word.length(); j++){ // 입력받은 단어의 길이만큼 반복해서
	            freq = map.get(word.charAt(j));  // map에 저장된 해당 문자의 빈도수를 freq에 저장
	            map.put(word.charAt(j), (freq == 0)?1:freq+1); // 만약 freq에 저장된 빈도수가 0인 경우 1로 초기화 이외의 경우 +1
	            output.write(word.charAt(j)); // output.txt 파일에 받은 문자들을 차례로 저장
	        }
		}
		output.close(); // 파일 닫음
		
		System.out.println("=====파일에 저장된 문자의 빈도수 출력=====");
		for (int k = 0; k < loop; k++) {
			System.out.println("key = " + map2.get(k) + "     value = " + map.get(map2.get(k)));
			// map2의 key 값에 해당되는 value 값으로 map의 key를 불러오고 이를 이용해 map의 value를 불러옴 
		}
	}
}
