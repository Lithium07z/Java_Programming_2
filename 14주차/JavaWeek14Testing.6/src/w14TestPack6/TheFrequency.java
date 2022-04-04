/*���α׷� �ۼ�����: 2019.11.28
 *���α׷� ����: �Էµ� ���ڿ��� output.txt ���Ͽ� ������ �� ������ �󵵼��� ����Ͽ� ����ϴ� ���α׷�
 *���α׷� �ۼ���: 20195138 ����ȣ
 *���α׷� ���� ��������: 2019.12.01 PM 02:50
 *�߰� ����: ���� �� �̷��� ���� �ɸ� ������ ������. �ٵ� ������ ���ϱ� �ʹ� ����. ��վ���. ���ж� �̷� ������ �ϸ� ���� �� ����.
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
			System.out.print("���ڿ� �Է�(����:f �Ǵ� F) : ");
			word = input.next();
			if (word.charAt(0) == 'f' || word.charAt(0) == 'F') { // f �Է½� ����
				break;
			}
			for (int i = 0; i < word.length(); i++) { // �ܾ� ���� ��ŭ �ݺ��ؼ�
				if (map.containsKey(word.charAt(i)) == true) { // ���� map�� �ִ� ���ڿ� �ܾ� �� ���ڰ� ��ġ�ϸ� �ƹ��͵� ���� �ʰ� �ѱ�
				} else {
					map.put(word.charAt(i), 0); // ���� map�� ���� �ܾ��� �ܾ� �߰� 
					map2.put(loop, word.charAt(i)); // map2�� map�� key ���� ����
					loop += 1; // loop�� �������� map2�� Ű ���� ������
				}
			}
			for (int j = 0; j < word.length(); j++){ // �Է¹��� �ܾ��� ���̸�ŭ �ݺ��ؼ�
	            freq = map.get(word.charAt(j));  // map�� ����� �ش� ������ �󵵼��� freq�� ����
	            map.put(word.charAt(j), (freq == 0)?1:freq+1); // ���� freq�� ����� �󵵼��� 0�� ��� 1�� �ʱ�ȭ �̿��� ��� +1
	            output.write(word.charAt(j)); // output.txt ���Ͽ� ���� ���ڵ��� ���ʷ� ����
	        }
		}
		output.close(); // ���� ����
		
		System.out.println("=====���Ͽ� ����� ������ �󵵼� ���=====");
		for (int k = 0; k < loop; k++) {
			System.out.println("key = " + map2.get(k) + "     value = " + map.get(map2.get(k)));
			// map2�� key ���� �ش�Ǵ� value ������ map�� key�� �ҷ����� �̸� �̿��� map�� value�� �ҷ��� 
		}
	}
}
